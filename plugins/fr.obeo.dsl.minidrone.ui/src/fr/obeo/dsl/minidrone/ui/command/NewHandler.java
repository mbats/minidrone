package fr.obeo.dsl.minidrone.ui.command;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Maps;

import fr.obeo.dsl.minidrone.MiniDroneFactory;
import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.ui.MinidroneUiActivator;

public class NewHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("New Handler");

		final IProgressMonitor monitor = new NullProgressMonitor();

		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				// closing existing editors
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeAllEditors(true);
				IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
				try {
					for (IProject project : projects) {
						project.delete(true, true, monitor);
					}
				} catch (CoreException e) {
					MinidroneUiActivator.log(Status.ERROR, "Project deletion failed", e);
				}
			}
		});

		try {
			final IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject("MinidroneProject", true,
					monitor);

			Option<ModelingProject> modelingProjectOption = ModelingProject.asModelingProject(project);

			if (modelingProjectOption.some()) {
				ModelingProject modelingProject = modelingProjectOption.get();
				final Session session = modelingProject.getSession();
				session.getTransactionalEditingDomain().getCommandStack()
						.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {

							@Override
							protected void doExecute() {

								// semantic step
								String semanticModelPath = project.getProject().getFullPath().toString()
										+ IPath.SEPARATOR + "sample.minidrone";
								final URI semanticModelURI = URI.createPlatformResourceURI(semanticModelPath, true);
								Resource res = new ResourceSetImpl().createResource(semanticModelURI);

								// Add the model root object
								final MiniDroneProgram rootModelObject = MiniDroneFactory.eINSTANCE
										.createMiniDroneProgram();
								
								// set a name for the root model object (todo)
								rootModelObject.setName("JSPilotingMinimal");
								

								if (rootModelObject != null) {
									res.getContents().add(rootModelObject);
								}
								try {
									res.save(Maps.newHashMap());
								} catch (IOException e) {
									MinidroneUiActivator.log(Status.ERROR, "Modeling project initialization failed", e);
								}

								session.addSemanticResource(semanticModelURI, monitor);

								enableViewpoints(monitor, session, "Design");
								
								session.save(monitor);

								// Sirius design step
								Collection<DRepresentation> representations = DialectManager.INSTANCE
										.getAllRepresentations(session);
								for (DRepresentation representation : representations) {
									if ("MiniDrone Program Diagram".equals(representation.getName())) {
										DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
										return;
									}
								}
							}
						}

				);

			}

		} catch (CoreException e) {
			MinidroneUiActivator.log(Status.ERROR, "Project creation failed", e);
		}
		return null;
	}

	private static void enableViewpoints(final IProgressMonitor monitor, final Session session,
			final String... viewpointsToActivate) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							ViewpointSelectionCallback vpsCallback = new ViewpointSelectionCallback();
							
							for(Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()){
								for (String viewpoint : viewpointsToActivate) {
									if(viewpoint.equals(vp.getName()))
										vpsCallback.selectViewpoint(vp, session, monitor);
								}
							}
						}
					});
		}
	}

}

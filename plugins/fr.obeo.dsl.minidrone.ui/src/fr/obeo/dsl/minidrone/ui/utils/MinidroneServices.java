/**
 *  Copyright (c) 2016 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.minidrone.ui.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.acceleo.module.main.Generate;
import fr.obeo.dsl.minidrone.ui.MinidroneUiActivator;

/**
 * A service about minidrone code generation, and other
 * 
 * @author rbary
 */
public class MinidroneServices {

	/***
	 * Called to generate a code to compile for piloting minidrone
	 * 
	 * @param minidroneProgram
	 * @return File
	 *
	 */
	public File generateCode(MiniDroneProgram minidroneProgram) {

		//boolean oldNotificationsPreferences = AcceleoPreferences.areNotificationsForcedDisabled();

		// disable acceleo preferences notifications
		AcceleoPreferences.switchForceDeactivationNotifications(true);

		// create a file
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(minidroneProgram.eResource().getURI().toPlatformString(true)));

		IFolder folder = file.getProject().getFolder("gencode");
		File genOutput = folder.getRawLocation().makeAbsolute().toFile();

		try {
			// do a acceleo generation
			Generate generator = new Generate(minidroneProgram.eResource().getURI(), genOutput,
					new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			MinidroneUiActivator.log(Status.ERROR, "Code generation failed", e);
		}

		//AcceleoPreferences.switchForceDeactivationNotifications(oldNotificationsPreferences);

		return genOutput;
	}

	/**
	 * Retrieve the semantic resource MinidroneProgram of the current session
	 * 
	 * @return MiniDroneProgram
	 */

	public MiniDroneProgram getMinidroneProgram() {

		Session session = getSession();

		if (session != null) {
			Collection<Resource> resources = session.getSemanticResources();

			if (resources.size() != 0) {
				Resource resource = (Resource) resources.toArray()[0];
				List<EObject> contents = resource.getContents();

				if (contents != null && contents.size() != 0) {
					return (MiniDroneProgram) contents.get(0);
				}
			}
		}
		return null;
	}

	/**
	 * Retrieve the current session of the graphic editor
	 * 
	 * @return Session
	 */
	public Session getSession() {
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
		if (sessions.size() > 0) {
			return (Session) sessions.toArray()[0];
		}
		return null;
	}

}
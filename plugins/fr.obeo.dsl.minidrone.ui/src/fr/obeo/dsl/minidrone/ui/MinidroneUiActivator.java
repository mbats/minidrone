package fr.obeo.dsl.minidrone.ui;

import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class MinidroneUiActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.obeo.dsl.minidrone.otherui"; //$NON-NLS-1$

	// The shared instance
	private static MinidroneUiActivator plugin;
	
	/**
	 * The constructor
	 */
	public MinidroneUiActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MinidroneUiActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	/**
	 * A helper to log plugin errors.
	 *
	 * @param severity
	 *            the error severity.
	 * @param message
	 *            the error message.
	 * @param exception
	 *            the error exception.
	 */
	public static void log(int severity, String message, Throwable exception) {
		getDefault().getLog().log(new Status(severity, PLUGIN_ID, message, exception));
	}
}

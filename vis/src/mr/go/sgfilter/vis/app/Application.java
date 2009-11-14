/*
 * Copyright [2009] [Marcin Rzeźnicki]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package mr.go.sgfilter.vis.app;

import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Application extends SingleFrameApplication {

	/**
	 * A convenient static getter for the application instance.
	 * 
	 * @return the instance of Application
	 */
	public static Application getApplication() {
		return Application.getInstance(Application.class);
	}

	/**
	 * Main method launching the application.
	 */
	public static void main(String[] args) {
		launch(Application.class, args);
	}

	/**
	 * This method is to initialize the specified window by injecting resources.
	 * Windows shown in our application come fully initialized from the GUI
	 * builder, so this additional configuration is not needed.
	 */
	@Override
	protected void configureWindow(java.awt.Window root) {
	}

	/**
	 * At startup create and show the main frame of the application.
	 */
	@Override
	protected void startup() {
		Thread.setDefaultUncaughtExceptionHandler(new VisAppExceptionHandler(
				Application.class));
		show(new View(this));
	}
}

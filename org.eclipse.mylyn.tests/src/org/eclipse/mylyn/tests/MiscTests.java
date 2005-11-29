/*******************************************************************************
 * Copyright (c) 2004 - 2005 University Of British Columbia and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University Of British Columbia - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylar.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.mylar.tests.bugs.BugzillaSearchPluginTest;
import org.eclipse.mylar.tests.bugs.BugzillaStackTraceTest;
import org.eclipse.mylar.tests.hypertext.HypertextStructureBridgeTest;

/**
 * @author Mik Kersten
 */
public class MiscTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.mylar.tests");
		//$JUnit-BEGIN$
        suite.addTestSuite(HypertextStructureBridgeTest.class);
		suite.addTestSuite(SharedTaskFolderTest.class);
		suite.addTestSuite(BugzillaSearchPluginTest.class);
		suite.addTestSuite(BugzillaStackTraceTest.class);
		//$JUnit-END$
		return suite;
	}

}
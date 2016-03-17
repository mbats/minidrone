/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Obeo - initial API and implementation
 * 
 */

package fr.obeo.dsl.minidrone.design.services;

import fr.obeo.dsl.minidrone.Go;
import fr.obeo.dsl.minidrone.Jump;
import fr.obeo.dsl.minidrone.Turn;
import fr.obeo.dsl.minidrone.JumpType;

/**
 * Manage diagram elements labels
 */

public class LabelServices {
	
	public String computeLabel(Go instruction) {
			int distance = ((Go) instruction).getDistance();
			return "Go : Distance = "+distance; //$NON-NLS-1$
	}
	
	public String computeLabel(Turn instruction) {
		int angle = ((Turn)instruction).getAngle();
		return "Turn : Angle = "+angle; //$NON-NLS-1$
	}
	
	public String computeLabel(Jump instruction) {
		JumpType jumpType = ((Jump)instruction).getJumpType();
		return "Jump : Type = "+jumpType; //$NON-NLS-1$
	}
}

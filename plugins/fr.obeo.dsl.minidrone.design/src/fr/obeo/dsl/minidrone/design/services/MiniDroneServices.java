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

import fr.obeo.dsl.minidrone.Instruction;
import fr.obeo.dsl.minidrone.MiniDroneProgram;

import java.util.List;

/**
 * Compute the next one instruction in the minidrone program instructions sequence from the current one.
 */

public class MiniDroneServices {	
	public Instruction getNextInstruction(Instruction instruction){
		MiniDroneProgram program = (MiniDroneProgram) instruction.eContainer();
		List<Instruction> instructions = program.getInstructions();
		int currentInstructionIndex = instructions.indexOf(instruction);
		if(currentInstructionIndex < instructions.size()){
			return instructions.get(currentInstructionIndex+1);
		}
		return null;
	}
}

package fr.obeo.dsl.minidrone.ui.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import fr.obeo.dsl.minidrone.MiniDroneProgram;
import fr.obeo.dsl.minidrone.ui.utils.MinidroneServices;

public class SyncHandler extends AbstractHandler {
	
	MinidroneServices minidroneService = new MinidroneServices();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("Sync handler");
		
		MiniDroneProgram minidroneProgram = minidroneService.getMinidroneProgram();
		
		if(minidroneProgram != null){
			minidroneService.generateCode(minidroneProgram);
		}		
		return null;
	}
}

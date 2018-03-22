import java.util.*;
public class ComandoMacro implements Command{

	ArrayList<Command> comandos = new ArrayList();


	public void execute(){

		for(Command cmd : comandos ){
			cmd.execute();
		}

	}

	public void undo(){

		for (Command cmd : comandos ) {
			cmd.undo();
		}

	}

	public void AddComando(Command cmd){
		comandos.add(cmd);
	}

	public void DelComando(Command cmd){
		comandos.remove(cmd);
	}

}
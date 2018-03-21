public class Invoker{

	Command comando;

	

	public void setCommand(Command cmd){

		comando = cmd;

	}

	public void buttonExecute(){
		comando.execute();
	}

	public void buttonUndo(){
		comando.undo();
	}

}
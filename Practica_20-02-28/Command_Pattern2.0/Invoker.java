import java.util.*;
public class Invoker{

	// int pointer = 0;
	ArrayList<Integer> pointers = new ArrayList();
	Command[] comandos = new Command[8];
	int index ;
	// boolean undone = true;
	public void setCommand(Command cmd){
		if(comandos.length <=8){
			comandos[index] = cmd;
			index++;
		}
		else{
			System.out.println("Todos los slots han sido ocupados intercambia uno porfavor");
		}
	}

	public void buttonExecute(int n){
			comandos[n].execute();
			pointers.add(n);
	}

	public void buttonUndo(int n){
			comandos[n].undo();
			pointers.add(n);
	}

	public void setCommands(){
		for(int i =0; i < comandos.length; i++){
			comandos[i] = null;
		}
	}


	// public int dameUndo(){
	// 	int size = pointers.size()-1;
	// 	if(pointers.size() != 0){
	// 		return pointers.get(size-1);
	// 	}
	// 	else{
	// 		throw new NullPointerException("No hay ningun undo por hacer");
	// 	}
	// }



}
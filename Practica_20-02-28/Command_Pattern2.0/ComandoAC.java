public class ComandoAC implements Command{
	
	AC ac = new AC();

	public void execute(){
		ac.Prender();
	}

	public void undo(){
		ac.setClima();
	}

}
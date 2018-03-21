public class ComandoLuces implements Command{
	Lights luces = new Lights();
	public void execute(){

		luces.On();
	}

	public void undo(){

		luces.Off();

	}
	
}
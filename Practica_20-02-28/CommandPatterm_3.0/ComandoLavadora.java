public class ComandoLavadora implements Command{

	Lavadora lavadora = new Lavadora();

	public void execute(){
		lavadora.Lavar();
	}

	public void undo(){
		lavadora.Apagar();
	}
}
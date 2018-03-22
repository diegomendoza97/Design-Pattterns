public class ComandoGarage implements Command{
	
	Garage garage = new Garage();

	public void execute(){
		garage.Open();
	}	

	public void undo(){
		garage.Close();
	}
}
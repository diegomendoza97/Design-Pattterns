public class ComandoCeiling implements Command{

	int state = 1;
	CeilingFan fan = new CeilingFan();
	boolean active = false;
	public void execute(){	
			if(state == 1){
				fan.Slow();
				state++;
				active = true;
			}
			else if(state == 2){
				fan.Medium();
				state ++;
				active = true;
			}
			else if(state == 3){
				fan.High();
				state++;
				active = true;
			}
			else{
				fan.Off();
				state = 1;
				active = true;
			}
	}

	public void undo(){
		if(state == 1){
			fan.Slow();
			state --;
			active = true;
		}
		else if(state == 2){
			fan.Medium();
			state --;
			active = true;
		}
		else if(state == 3){
			fan.High();
			state --;
			active = true;
		}
		else{
			fan.Off();
			System.out.println("El ceiling esta apagado");
			active = true;
			// state = "high";
		}
	}




}
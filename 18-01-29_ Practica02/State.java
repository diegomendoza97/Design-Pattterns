public class State implements Validacion{
	public void validar(String validate){
		boolean valido = true ;
		if(validate.matches("[0-9]+")){
			valido = false;
		}
		
		System.out.println(valido);
	}
}
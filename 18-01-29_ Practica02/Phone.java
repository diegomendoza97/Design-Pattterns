public class Phone implements Validacion{
	public void validar(String validate){
		boolean valido = false;
		if(validate.matches("[0-9]+")){
			valido = true;
		}
		System.out.println(valido);
	}
}
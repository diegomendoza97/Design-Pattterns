public class Password implements Validacion{
	public void validar(String validate){
		boolean validar = false;;
		if(validate.length()> 5 && validate.matches("[0-9]+")){
			validar = true;
		}
		System.out.println(validar);
	}
}
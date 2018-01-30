public class Email implements Validacion{
	public void validar(String validate){
		boolean valido = false ;
		if(validate.contains("@") && validate.endsWith(".com")){
			valido = true;
		}
		
		System.out.println(valido);
	}
}
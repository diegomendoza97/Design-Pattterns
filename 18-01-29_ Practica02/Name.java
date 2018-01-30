public class Name implements Validacion{
	public void validar(String validate){
		boolean valido = true ;
		//Pattern pat;

		if(validate.matches("[0-9]+"))
			valido  = false;


		System.out.println(valido);
	}
}
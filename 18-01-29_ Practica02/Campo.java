public abstract class Campo {	
	Validacion validacion;

	public void setValidation(Validacion v){
		validacion = v;
	}

	public void validar(String value){
		validacion.validar(value);
	}
}
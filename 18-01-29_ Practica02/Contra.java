public class Contra extends Campo {
	static String password = "1234123lakjsd";
	public static void main(String[] args) {
		Contra pass = new Contra();
		pass.setValidation(new Password());
		pass.validar(password);
	}
}
public class Main{

	public static void main(String[] args) {
		float temperatura = 80.2f;
		float humedad = 18.283f;
		float pression = 120.2f;


		Observador Observador;

		WeatherData sujeto;

		Observador = new DisplayA();

		sujeto = new WeatherData(temperatura,humedad,pression);
		sujeto.Register(Observador);

		Observador = new DisplayB();
		sujeto.Register(Observador);


		System.out.print("Medidas :\n");
		sujeto.MeasurementsChange();

	}
}
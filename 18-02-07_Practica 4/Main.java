import java.util.*;
public class Main{

	
	public static void main(String[] args) {

		float temperatura = 80.2f;
		float humedad = 18.283f;
		float pression = 120.2f;

		WeatherData weatherdata = new WeatherData(temperatura,humedad,pression);

		DisplayA Observador =  new DisplayA(weatherdata);
		
		System.out.print("Medidas :\n");
		weatherdata.setMeasurements();


		temperatura = temperatura/2;
		humedad = humedad*2;
		pression = pression/2.4f;

		DisplayB Observador2 = new DisplayB(weatherdata);
		System.out.println("\nActualización");
		weatherdata.setMeasurements();
	}
}
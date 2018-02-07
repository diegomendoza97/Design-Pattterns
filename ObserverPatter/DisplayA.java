public class DisplayA implements Observador, Displayer{
	float temperature;
	float humidity;
	float pressure;
	public void update(float temp, float hum, float press){
		temperature = temp;
		humidity = hum;
		pressure = press;
		Mostrar();
	}

	public void Mostrar(){
		System.out.println("DisplayA");
		System.out.println("Temperature: "+ temperature);
		System.out.println("Humidity: "+ humidity);
		System.out.println("Pressure: "+pressure );
	}
}
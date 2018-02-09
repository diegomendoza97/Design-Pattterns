import java.util.*;

public class DisplayA implements Observer, Displayer{
	float temperature;
	float humidity;
	float pressure;

	public DisplayA(Observable weatherdata){
		weatherdata.addObserver(this);
	}

	public void update(Observable observable, Object object){
		if(observable instanceof WeatherData){

			WeatherData w = (WeatherData)observable;
			this.temperature = w.temp;
			this.humidity = w.hum;
			this.pressure = w.press;
			Mostrar();
		}
		
	}

	public void Mostrar(){
		System.out.println("DisplayA");
		System.out.println("Temperature: "+ temperature);
		System.out.println("Humidity: "+ humidity);
		System.out.println("Pressure: "+pressure );
	}
}
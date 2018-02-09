import java.util.*;


public class WeatherData extends Observable{
	 float temp;
	 float hum;
	 float press;	
	// List<Observador> subscriptores  = new ArrayList<Observador>();

	public WeatherData(float temp, float hum, float press){
		this.temp = temp;
		this.hum = hum;
		this.press  = press;
	}

	public void MeasurementsChange(){
		setChanged();
		notifyObservers();
		

	}

	public  void setMeasurements(){

		MeasurementsChange();

	}


	// public void setTemperature(float temperatura){
	// 	temp  = temperatura;
	// }

	// public void setHumidity(float humedad){
	// 	hum = humedad;
	// }

	// public void setPress(float presion){press = presion;}


}
import java.util.*;
public class WeatherData implements Subject{
	float temp;
	float hum;
	float press;	
	List<Observador> subscriptores  = new ArrayList<Observador>();

	public WeatherData(float temp, float hum , float press){
		this.temp = temp;
		this.hum = hum;
		this.press  = press;
	}

	public void Remove(Observador o){
		subscriptores.remove(o);
	}

	public void Register(Observador o){
		subscriptores.add(o);
	}

	public void Notify(float temp, float hum, float press){

		for(Observador ob : subscriptores){
			ob.update(temp, hum, press);
			System.out.println(" ");
			//ob.Mostrar();
		}
	}

	public void MeasurementsChange(){
		Notify(temp,hum,press);
	}

}
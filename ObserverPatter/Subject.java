public interface Subject{
	public void Remove(Observador o);

	public void Register(Observador o);

	public void Notify(float temp, float hum, float press);

	
}
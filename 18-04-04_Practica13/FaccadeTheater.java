public class FaccadeTheater{

		/*
			DVD
			Tuner
			PopCorn Popper
			Screen
			Amplificador
			CDPlayer
			Projector
			Lights
		*/

		Dvd dvd = new Dvd();
		Tuner tuner = new Tuner();
		Screen screen = new Screen();
		Amplificador amp = new Amplificador();
		CDPlayer cd = new CDPlayer();
		Proyector proyector = new Proyector();
		Lights lights = new Lights();

	public void WatchMovie(){
		amp.On();
		amp.setDVD();
		screen.On();
		proyector.On();
		proyector.TVMode();
		dvd.On();
		lights.On();
		lights.Dim();
		dvd.Play();

		}

	public void PlayMusic(){

			amp.On();
			amp.setCD();
			tuner.SetFrequency();
			cd.On();
			cd.Play();
			System.out.println("Tocando BackStreets Boys...");
		}

	public void ChangeMovietoMusic(){
			lights.On();
			dvd.Off();
			proyector.Off();
			screen.Off();
			amp.setCD();
			tuner.SetFrequency();
			cd.On();
			cd.Play();
			System.out.println("Tocando BackStreets Boys...Todavia");
		}
}
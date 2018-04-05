public class Main{

	public static void main(String[] args) {
		
		FaccadeTheater fac = new FaccadeTheater();
		System.out.println("Ver Pelicula");
		fac.WatchMovie();

		System.out.println("\nTocar Musica");
		fac.PlayMusic();

		System.out.println("\nDe Pelicula a Musica");
		fac.ChangeMovietoMusic();
	}

}
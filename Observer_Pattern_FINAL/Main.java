import java.util.*;
public class Main{

	static Dhl dhl = new Dhl();
	static Fedex fedex = new Fedex();
	static CorreoMex mex = new CorreoMex();
	static int intervalDhl = 600;
	static int intervalcomex = 7200;
	static int intervalfed = 600;

	public static void main(String[] args) {
		Timer timer = new Timer();
		Timer timerDHL = new Timer();
		Timer timerFedex = new Timer();
		Timer timerCorreo = new Timer();

		ClienteA test = new ClienteA("Diego");
		ClienteA clienteA = new ClienteA("Luis");
		ClienteB test2 = new ClienteB("Zari");
		

		test.subscribe(dhl);
		test.ordernarPaquete();
		clienteA.subscribe(fedex);
		clienteA.ordernarPaquete();

		test2.subscribe(mex);
		test2.ordernarPaquete();
		//mex.Notify();

		clienteA.subscribe(dhl);
		//dhl.Notify();

		System.out.println();
		//fedex.Notify();

		timerDHL.scheduleAtFixedRate(new TimerTask() {
	    	public void run() {
	      		dhl.Notify();
	    	}
		}, intervalDhl, intervalDhl);

		timerFedex.scheduleAtFixedRate(new TimerTask() {
	    	public void run() {
	      		fedex.Notify();
	    	}
		}, intervalfed, intervalfed);

		timerCorreo.scheduleAtFixedRate(new TimerTask() {
	    	public void run() {
	      		mex.Notify();
	    	}
		}, intervalcomex, intervalcomex);

	}
	

}
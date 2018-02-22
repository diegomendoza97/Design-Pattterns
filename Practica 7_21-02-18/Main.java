import java.io.*;
public class Main{

	public static void main(String[] args) throws IOException {
		
		int c;

		try{
			InputStream in = new BufferedInputStream(new FileInputStream("test.txt"));
			in = new LowerInputStream(in);

			while((c = in.read()) != -1){
				System.out.print((char)c);
			}
			
			in .close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
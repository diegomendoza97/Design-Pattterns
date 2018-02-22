import java.io.*;
public class LowerInputStream extends FilterInputStream{

	// int letra = in.read();

	public LowerInputStream(InputStream in) {
    	super(in);
  }

  public int read() throws IOException{
  	int caracter = in.read();
  	if(caracter == -1){
  		return -1;
  	}
  	else{
	  	char letra  = toLower((char)caracter);
	  	return letra;
  	}
  }

  public char toLower(char c){

  	char lc = Character.toLowerCase(c);
  	return lc;
  }

} 


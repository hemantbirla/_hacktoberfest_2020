import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}


public class AveragedPairs {
	
	public static void main(String[] args) throws IOException {
		Reader.init(System.in);
		int a  = Reader.nextInt();
		int sizearr = Reader.nextInt();
		int arr[] = new int[sizearr];
		for(int j=0;j<sizearr;j++) {
			arr[j] = Reader.nextInt();
		}
		int flag = 0;
		int leftindex = 0;
		int rightindex = arr.length-1;
		while(leftindex<rightindex) {
			if((arr[leftindex] + arr[rightindex])/2 == a) {
				System.out.println(leftindex + " " + rightindex);
				flag = 1;
				break;
			}
			else if(((arr[leftindex]) + arr[rightindex])/2 < a) {
				leftindex++;
			}
			else if(((arr[leftindex]) + arr[rightindex])/2 > a) {
				rightindex--;
			}
			
		}
		
		if(flag == 0) {
			System.out.println(-1);
		}
		
		
	}

}


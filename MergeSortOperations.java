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


public class MainMerge {
	
	static int search(int arr[], int n, int x){
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
	
	
	//MergeSort
    public static void sort(int[] a, int low, int high,int[] indexarray) 
    {
    	
    	int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        sort(a, low, mid,indexarray); 
        sort(a, mid, high,indexarray); 
        int[] temp = new int[N];
        int[] temp1=new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid) {
                temp[k] = a[j];
                temp1[k]=indexarray[j];
                j++;
            }
            else if (j == high) { 
                temp[k] = a[i];
                temp1[k]=indexarray[i];
                i++;
            }
            else if (a[j]<a[i]) { 
                temp[k] = a[j];
                temp1[k]=indexarray[j];
                j++;
            }
            else {
                temp[k] = a[i];
                temp1[k]=indexarray[i];
                i++;
            }
        }    
        for (int k = 0; k < N; k++) {
            a[low + k] = temp[k]; 
        	indexarray[low+k] = temp1[k];
        }
        	
    }

	
	public static void main(String[] args) throws IOException {
		Reader.init(System.in);
		int t = Reader.nextInt();
		for(int test=1;test<=t;test++) {
			int arrsize = Reader.nextInt();
			int[] inparr = new int[arrsize+1];
			int[] indexarray = new int[arrsize+1];
			for(int j=0; j<arrsize; j++) {
				int inpnum = Reader.nextInt();
				inparr[j] = inpnum;
				inparr[j] = inpnum;
				indexarray[j] = j+1;
			}
			
			sort(inparr,0,inparr.length-1,indexarray);

	        int maxval = inparr[inparr.length-1];
			int sum = 0;
			int operations = 0;
			int x = 0;
			
			while(x<arrsize) {
				
				
				inparr[x] -= sum;
				if(inparr[x]<0) {
					x++;
					continue;
				}
				int yy = (inparr[x]/indexarray[x]) + 1;
				sum += yy*indexarray[x];
				operations+=yy;
				x++;
				
			}
	        
			System.out.println(operations);
			
	        
		}
		
	}

}


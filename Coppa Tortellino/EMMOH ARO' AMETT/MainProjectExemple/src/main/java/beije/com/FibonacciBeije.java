/*package beije.com;

import java.util.Arrays;


public class FibonacciBeije {//Fibonacci's class

	public FibonacciBeije() {
		System.out.println(fibonacci());
	}

	public String fibonacci() {// method to return the Fibonacci's sequences
		long primo = 0L, secondo = 1L,risultato=0L, appoggio=0L;
		long arr[]=new long[50];
		arr[0]=0;
		arr[1]=1;
		int i=2;
		while(i<50) {//cycle to save 50 times the Fibonacci's sequences into an Array
			risultato=primo+secondo;
			arr[i]=risultato;
			appoggio=secondo;
			secondo=risultato;
			primo=appoggio;
			i++;
		}
		return Arrays.toString(arr);//return the Array
	}
}
*/


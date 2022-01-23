package primenum;
import java.io.*;

public class PrimeNumbers {

	public static void main(String[] args) throws Exception{
		int i;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		int num = Integer.parseInt(bf.readLine());
		for (i=1; i<=num; i++) {
			int j;
			boolean isPrime = true;
			for(j=2; j <= i/2; j++) {
				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
				
			}
			if (isPrime) {
				System.out.print(i+" ");
			}
		}
	}
}

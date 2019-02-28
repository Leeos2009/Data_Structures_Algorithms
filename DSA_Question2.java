import java.util.*;
public class DSA_Question2 {
	public static void main(String args[]) {
		int[] A = new int[1000000];
		for(int i = 0; i < 999999; i++)
		{
			A[i] = (int)(Math.random() * 1000000) + 1;
		}
		//System.out.println(LinearSearch(A, 10, 7));
		
		
		long start = System.nanoTime();
		System.out.println("Factorial: " + Factorial(25));
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Factorial Time: " + time + " nanoseconds");
		 
		start = System.nanoTime();
		System.out.println("Power: " + Power(2,10));
		end = System.nanoTime();
		long time1 = end - start;
		System.out.println("Power Time: " + time1 + " nanoseconds");
		
		start = System.nanoTime();
		System.out.println(LinearSearch(A, A.length, (int)(Math.random() * 1000000) + 1));
		end = System.nanoTime();
		long time2 = end - start;
		System.out.println("Linear Search Time: " + time2 + " nanoseconds");
		
		
	}
	public static long Factorial(int a) {
		int factorial = 1;
		for(int k = 1; k < a; k++) {
			factorial = factorial * k;
		}
		return factorial;
		
	}
	
	public static int Power(int a, int b) {
		int power = 1;
		for(int k = 1; k < b; k++) {
			power = power * a;
		}
		return power;
	}
	
	public static int LinearSearch(int A[], int n, int q) {
		int i = 0;
		while(i < n)
		{
			if(A[i] != q)
			{
				i++;
			}
			else if(i == n) {
				return -1;
			}
			else 
				return i;
		}
		return i;
	}
}

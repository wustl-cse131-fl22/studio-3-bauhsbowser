package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Up until what number do you want to determine the prime of?");
		int n = in.nextInt();
		
		int[] sieved = new int[n + 1];
		
		for(int i = 0; i < sieved.length; i++)
		{
			sieved[i] = i;
			System.out.println(sieved[i]);
		}	
		
		boolean[] primes = new boolean[n+1];
		
		for(int i = 2; i < Math.sqrt(n); i++)
		{
			primes[i] = false;
			for(int j = 2; j < sieved.length; j++)
			{
				if(i != j && j % j > 0)
				{
					primes[i] = true;
					System.out.println(i + " is prime");
				}
			}
		}
		
		
		
		
		/**for(int i = 2; i < sieved.length; i++)
		{
			int prime = 0; 
			int currentNumber = i;
			for(int j = 2; j < sieved.length; j++)
			{
				if (sieved[i] != currentNumber)
				{
					if(sieved[i] % j > 0)
					{
						prime = sieved[i];
					}
				}
			}
			
			if (prime == i)
			{
				System.out.println(prime + " is prime");
			}
		**/
			
		}
	}
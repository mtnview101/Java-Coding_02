// Java Coding Challenge - 03: Print out prime numbers 0 - 100
package core;

public class Prime {

	     public static boolean isPrime(int prime_number)       {

           if (prime_number <= 1) return false; //1 is not prime number
           if (prime_number == 2) return true; //2 is only even prime number
           if (prime_number % 2 == 0) return false; //excluding all even number

	           for (int i = 2; i < prime_number; i++) {
/*	        	check to divide to some number from 2 to present value, 
	        	if divided then present number is not prime number*/
	        	   if (prime_number % i == 0) return false; }
	                                           return true; }

	     public static void main(String[] args)                      {
	         int max = 100;
	         int n=1;
	         
	         System.out.println("Program for Print out prime numbers from 0 to "+max);
	         System.out.println("----------------------------------------------------");

	         for (int i = 1; i <= max; i++) 
	         {
	             if (isPrime(i)) {System.out.println("Prime#"+n+": "+i);n++;  }
	         }
	         
	         System.out.println("----------------------------------------------------"); 
	         
	         System.out.println("We found totally  "+(n-1)+" prime numbers from 0 to "+max);

	                                                                  }}


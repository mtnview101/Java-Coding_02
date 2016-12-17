// Java Coding Challenge - 04: Print out perfect numbers 0 – 10,000

package core;

public class Perfect_number {

	         public static boolean isPerfectNumber (int perfect_number) {
	            int temp=0;
	            for(int i=1;i<=perfect_number/2;i++){
	                if (perfect_number%i==0){temp+=i;}}
	             
	                if(temp==perfect_number){return true;}
	                else 
	                	{return false;}}

	    public static void main(String args[]) {

	        int max=10000;
	                
	        for(int i=1;i<=max;i++){if(isPerfectNumber(i)){System.out.print(i+" ");}}


	    }
	}

/*Java Coding Challenge - 05: Print out Armstrong numbers 100 - 999

число  Армстронга — натуральное число, которое 
в данной системе счисления равно сумме своих цифр, 
возведённых в степень, равную количеству его цифр.*/

package core;

public class Armstrong {
	    
	    public static boolean isArmStrong(int armstrong_number ){
		int result=0;
		int orig=armstrong_number;
	        if(armstrong_number<100) {return false;}
	        while (armstrong_number !=0){
	                                        int remainder=armstrong_number%10;
	                                        result=result+((int) Math.pow(remainder,3));
	                                        armstrong_number=armstrong_number/10;}
	        if(orig==result){return true;}
	        return false;
	}

	    public static void main(String args[]){

	int armstrong_number=0;
	int max=999;
	        for(int i=0;i<=max;i++)
	        {
	            armstrong_number=i;
	            if(isArmStrong(armstrong_number))
	            System.out.print(armstrong_number+" ");
	        }

	    }

	}

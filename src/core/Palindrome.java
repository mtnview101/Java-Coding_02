/*Java Coding Challenge - 10 Palindrome numbers
A palindromic number is a number (in some base ) that is the same when 
written forwards or backwards, i.e., of the form . The first few palindromic 
numbers are therefore are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 
66, 77, 88, 99, 101, 111, 121, ... (OEIS A002113).*/
package core;
 
public class Palindrome { 
	    public static void main(String args[]){

	int[] numbers={456, 321, 121, 578, 656};
	
	for(int i=0;i<numbers.length;i++){
		int reverse=0;
		int origin=numbers[i];
		while(numbers[i]>0){
			reverse=reverse*10+numbers[i]%10;
			numbers[i]=numbers[i]/10;
		}
		if (origin==reverse)
			System.out.println(origin+" is palindrome number"); else
				   System.out.println("          |"+origin+" is not palindrom number");
		
		}

 
}
}

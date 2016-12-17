// Java Coding Challenge - 09 Duplicate numbers

package core;
import java.util.Arrays;

public class Duplicate_numbers {
		
public static void main(String args[]){

	int[] numbers={1, 5, 7, 54, 62, 2, 1, 54, 24, 1};
	Arrays.sort(numbers); //1.1.1.2.5.7.24.54.54.62
	int dup_number=0;
	
	for(int i=0;i<numbers.length-1;i++){
			
	    if (numbers[i]==numbers[i+1]){
	        dup_number++;
	        System.out.println("Duplicate #"+dup_number+": "+numbers[i]); }
		}
}
}

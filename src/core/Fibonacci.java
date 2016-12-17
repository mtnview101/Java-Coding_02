package core;

public class Fibonacci {
	public static long f(long n) {return n>2?f(n-1)+f(n-2):n;}
	public static void main(String[] args) {
		System.out.println("1: 1");
		for(long number=1;number<93;number++){
		//long f=f(number);
		System.out.println(number+": "+f(number));}
}
}
/*//Java Coding Challenge - 03: Print out Fiboncci numbers 0 - 93

class Rextester
{  
 public static void main(String args[])
 {
//------------------------------------------------------------
int max=92;
     long[] a;
     a = new long[max+1];
     a[0]=0;
     a[1]=1;
     System.out.println("1: "+a[0]);
     System.out.println("2: "+a[1]);
     for(int i=2;i<=max;i++){
         
                     a[i]=a[i-2]+a[i-1];
                     System.out.println((i+1)+": "+a[i]);
         
     }
//------------------------------------------------------------ 
 }
}*/
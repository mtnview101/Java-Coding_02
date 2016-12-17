package core;

import java.math.BigInteger;

public class Fibonacci1000 {


    public static void main(String args[])
    {
//------------------------------------------------------------
int max=999;
        BigInteger[] a;
        a = new BigInteger[max+1];
        a[0]=BigInteger.ZERO;
        a[1]=BigInteger.ONE;
        System.out.println("1: "+a[0]);
        System.out.println("2: "+a[1]);
        for(int i=2;i<=max;i++){
            
                        a[i]=a[i-2].add(a[i-1]);
                        System.out.println((i+1)+": "+a[i]);
            
        }
//------------------------------------------------------------ 
    }
}

package ddd;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	 public static void main(String args[]) {

	       //input to print Fibonacci series up to how many numbers
	        System.out.println("Enter number up to which Fibonacci series to print: ");
	        BigInteger i = BigInteger.valueOf(new Scanner(System.in).nextLong());

	        System.out.println("First " + i + " Fibonacci numbers: ");
	        //printing Fibonacci series upto number
	        for(int j=1; i.compareTo(BigInteger.valueOf(j))<0; j++){
	            System.out.print(fibonacci2(BigInteger.valueOf(j)) +" ");
	        }


	    } 







	    public static BigInteger fibonacci2(BigInteger number){
	        if(number.compareTo(BigInteger.valueOf(1)) == 0 || number.compareTo(BigInteger.valueOf(2)) == 0){
	            return BigInteger.valueOf(1);
	        }
	        BigInteger fibo1=BigInteger.valueOf(1), fibo2=BigInteger.valueOf(1), fibonacci=BigInteger.valueOf(1);
	        for(int i=3; number.compareTo(BigInteger.valueOf(i))<=0; i++){

	          //Fibonacci number is sum of previous two Fibonacci number
	          fibonacci = fibonacci.add(fibo1.add(fibo2));             
	          fibo1 = fibo2;
	          fibo2 = fibonacci;

	        }
	        return fibonacci; //The current Fibonacci number

	    }   
	}


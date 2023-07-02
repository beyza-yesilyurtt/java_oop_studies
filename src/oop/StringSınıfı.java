package oop;
import java.util.Scanner;
public class StringSınıfı {

	 public static int FirstFactorial(int num) {
		   int result=1;
		   for(int i=1; i<=num; i++) {
			   result = i*result;
		   }
		    return result;
		  }

		  public static void main (String[] args) {  
		  Scanner scan= new Scanner(System.in);
		  System.out.println("Faktöriyel sayısı : ");
		  int num= scan.nextInt();
		  System.out.println(FirstFactorial(num));
		  }
		  }



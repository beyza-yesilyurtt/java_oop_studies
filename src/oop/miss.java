package oop;

import java.util.Scanner; 
public class miss {

  public static int MathChallenge(int num) {
     for(int i=1; i<=num ; i++) {
    num += i;
    return num;
  }
  }
  public static void main (String[] args) {  
       
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=input.nextInt();
    System.out.print(MathChallenge(num));
  }

}
	


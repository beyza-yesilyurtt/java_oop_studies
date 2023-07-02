package oop;

import java.util.Scanner;

public class example4 {

	public static void main(String [] args) {
		
	     String user1, user2;
	     int pointa = 0, pointb=0;
	    
	     int [] a = new int[3];
	 	int [] b= new int[3];	
	 	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First User Name: ");
		user1=scan.next();
		System.out.println("Second User Name: ");
		user2= scan.next();
		
		System.out.println(user1 + "  Enter your 3 number: ");
	    a[0]=scan.nextInt();
	    a[1]=scan.nextInt();
	    a[2]=scan.nextInt();
	    
	    System.out.println(user2 + "  Enter your 3 number: ");
	    b[0]=scan.nextInt();
	    b[1]=scan.nextInt();
	    b[2]=scan.nextInt();
	    
	   
	    
	    if(a[0]> b[0] || a[1]>b[1] || a[2]>b[2]) {
	    	 for(int i=0; i<a.length; i++) {
	      pointa += i;
	     System.out.println("User1: " + pointa);
	     System.out.println("User2: " + pointb); 
	    	 
	   
	    else if(b[0]> a[0] && b[1]>a[1] && b[2]>a[2]) {
	    	for(int j=0; j<b.length; j++) {
	    		pointb += j;
	    		System.out.println("User1: " + pointa);
	    		System.out.println("User2: " + pointb);
	    
	    		else if(a[0] == b[0] || a[1] == b[1] || a[2] == b[2]) {
	    		pointa =0;
	    		pointb=0;
	    		System.out.println("User1: " + pointa);
	    		System.out.println("User2: " + pointb);
	    	 }
	    
	    	if(pointa>pointb) {
	    		System.out.println("User1 won!");
	    		if(pointb>pointa) {
	    			System.out.println("User2 won!");
	    		}
	    		else {
	    			System.out.println("There is no winner.");
	    		}
	    	}
	     }
	   
		
	}
}
}
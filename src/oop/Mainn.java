package oop;
import java.util.Scanner; 

public class Mainn {

	public static boolean CodelandUsernameValidation (String str ) {
	
       
		if (str.length() <= 4 || str.length() >= 25) {
		      // System.out.println("Failed length");
		      return false;
         }
        	 if (str.charAt(str.length() - 1) == '_') {
        		 return false;
}
        	 if (!Character.isLetter(str.charAt(0))) {
        		 return false;
        		 
        	 }
        	 for (int i = 0; i < str.length(); i++) {
        	      if (!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i) != '_') {
	     return false;
        	      }
        	      
        
	  }
        	return true;
        	
	}
	

	  public static void main (String[] args) {  
	     
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Kullanıcı adı giriniz: ");
	    String str= scan.next();
	     System.out.println(CodelandUsernameValidation(str));
	  }

	}

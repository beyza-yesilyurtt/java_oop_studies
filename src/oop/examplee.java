package oop;

import java.util.Scanner;

public class examplee {

	public static String FindIntersection(String[] strArr) {
		 String str3 = new String();
		    String[] arrSplit1 = strArr[0].split(", ");
		    String[] arrSplit2 = strArr[1].split(", ");
		     for(int i = 0; i<arrSplit1.length ;i++)
		       {       
		         int k =0;
		          for(int j=k;j<arrSplit2.length; j++)
		          {                     
		            if((Integer.parseInt(arrSplit1[i])) == (Integer.parseInt(arrSplit2[j])))
		            {
		            
		             str3 = str3 + arrSplit1[i]+",";
		                                       
		            }


		          }

		       }

		    String str4 = "";
		       for (int k =0;k < str3.length()-1 ; k++)
		       {
		            str4 = str4 + str3.charAt(k);
		       }
		       if (str4 == "")
		       str4 = "false";

		    return str4;
		  }

		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter the string array : ");
		    String strArr=scan.next();
		    System.out.print(strArr);
		  }

		}
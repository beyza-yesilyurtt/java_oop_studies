package oop;
import java.util.Scanner;

public class sınıflar2 {
 
	public static void main(String[] args) {
		//oop
	    //SinifAdi = new SinidAdi();
		
	Scanner input= new Scanner(System.in);	
	
	
	System.out.println("Birinci sayıyı seçiniz :");
	int x=input.nextInt();
	System.out.println("İkinci sayıyı seçiniz :");
	int y=input.nextInt();
	
	
	String s2="toplama";
	String s3= "çıkarma";
	String s4="çarpma";
	String s5="bölme";
	
	HesapMakinesi m1 = new HesapMakinesi(x,y);
	
	System.out.println("Yapmak istediğiniz işlemi seçiniz (toplama,çıkarma,çarpma,bölme) : ");
	String işlem = input.next();
	
	if(işlem.equals(s2)) {
		System.out.println(m1.toplam());
	}

	if(işlem.equals(s3)) {
		System.out.println(m1.cikarma());
	}
	if(işlem.equals(s4)) {
	
	System.out.println(m1.carpma());
		
	}
	if(işlem.equals(s5)) {
	System.out.println(m1.bolme());

	}


	}
}

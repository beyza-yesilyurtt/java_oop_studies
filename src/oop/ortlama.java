package oop;
import java.util.Scanner;
public class ortlama {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[] notlar = new int[4];
		int toplam=0;
		System.out.println("Lütfen notlarınızı sırayla giriniz.");
		System.out.print("Matematik  : ");
		notlar[0] = scan.nextInt();
		System.out.print("Türkçe : ");
		notlar[1] = scan.nextInt();
		System.out.print("Sosyal  : ");
		notlar[2] = scan.nextInt();
		System.out.print("Fen : ");
		notlar[3] = scan.nextInt();
		
		for(int not: notlar) {
			toplam += not;
		}
System.out.println("Ort. : " + (toplam/notlar.length));
	}


}

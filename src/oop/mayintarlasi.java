package oop;
import java.util.Random;
import java.util.Scanner;
public class mayintarlasi {
	
	int satir, sutun, size;
	int matris [][];
	int[][] kullanicitahtasi;
	boolean game= true;
	
	Random rand = new Random();
	Scanner scan= new Scanner(System.in);
	
	
	mayintarlasi(int satir, int sutun) {
		this.satir= satir;
		this.sutun=sutun;
		this.matris = new int[satir][sutun];
		this.kullanicitahtasi= new int [satir][sutun];
		this.size=satir*sutun;
		
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int satirsayisi,sutunsayisi;
		System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz! ");
		System.out.println("Satır sayısı : ");
		satirsayisi=scan.nextInt();
		System.out.println("Sütun sayısı : ");
		sutunsayisi= scan.nextInt();
		
		mayintarlasi mayin= new mayintarlasi(satirsayisi, sutunsayisi);
		mayin.run();
		
		
	}
	
	public void run() {
		int satirsayisi, sutunsayisi, success=0;
		oyunsablon();
		System.out.println("Random mayın tarlasi : ");
		print(matris);
		System.out.println("Oyun başladı!");
		while(game) {
			print(kullanicitahtasi);
			System.out.print("Satır : ");
			satirsayisi = scan.nextInt();
			System.out.print("Sütun :");
			sutunsayisi= scan.nextInt();
			if(satirsayisi <0 || satirsayisi >= satir) {
				System.out.println("Geçersiz kordinat!");
				continue;
			}
			if (sutunsayisi<0 || sutunsayisi >=sutun) {
				System.out.println("Geçersiz kordinat !");
				continue;
			}
			if(matris[satirsayisi][sutunsayisi] != -1) {
				mayinkontrol(satirsayisi,sutunsayisi);
				success ++;
				if(success == (size - (size/4))) {
					System.out.println("Hiçbir mayına basmadan oyunu tamamladınız!");
					break;
				}
			}else {
				game=false;
				System.out.println("GAME OVER!");
			}
				
			}
	}
	
			public void mayinkontrol(int sa, int su) {
				if(kullanicitahtasi[sa][su] ==0) {
				if((su < sutun -1 ) && (matris [sa][su +1] == -1)) {
				kullanicitahtasi[sa][su] ++;
				}
				if((sa < satir -3) && (matris [sa+1][su] == -1)) {
					kullanicitahtasi[sa][su] ++;
				}
				if((sa >0) && (matris [sa -1][su] == -1)) {
					kullanicitahtasi[sa][su ] ++; 
				}
				if((su >0) && (matris [sa][su -1] == -1)) {
					kullanicitahtasi[sa][su] ++;
					
					
				}
				
				if(kullanicitahtasi[sa][su] ==0) {
					kullanicitahtasi[sa][su] = -2;
				}
					
				}
			}
	
	
	public void oyunsablon() {
		
		int randsatir, randsutun, count=0;
		while( count!= (size/4)) { {
			randsatir= rand.nextInt(satir);
			randsutun=rand.nextInt(sutun);
			if(matris[randsatir][randsutun] != -1) {
				matris[randsatir][randsutun] = -1;
				count++;
			}
		}
		}
	}
	
	public void print (int[][] arr) {
		for(int i=0; i< arr.length; i++) {
		for (int j= 0; j<arr[0].length ; j++ ) {
			if(arr[i][j]>=0)
				System.out.print(" ");
		System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}

	}
}



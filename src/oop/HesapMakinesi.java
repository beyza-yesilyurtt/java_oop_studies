package oop;

public class HesapMakinesi {
	public int sayi1;
	public int sayi2;
	
	
	HesapMakinesi(int sayi1,int sayi2) {
		this.sayi1= sayi1;
		this.sayi2= sayi2;
		
	}
	
	public int toplam() {
		return this.sayi1 + this.sayi2;
	}
	public int cikarma () {
		return this.sayi1 - this.sayi2;
	}
	public int carpma() {
	return this.sayi1 * this.sayi2;
}
    public int bolme() {
    	return this.sayi1 / this.sayi2;
    	
    }
}

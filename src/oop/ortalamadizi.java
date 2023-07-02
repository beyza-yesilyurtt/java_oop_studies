package oop;

public class ortalamadizi {
public String name;
public int vize, fınal;
public int ortalama;
	
 ortalamadizi(String name, int vize, int fınal, int ortalama) {
	this.name= name;
	this.vize=vize;
	this.fınal=fınal;
	this.ortalama=ortalama;
 }
	
	public String name() {
		return this.name;
	}
	
	public int vize() {
		return this.vize;
	}
	
	public int fınal() {
		return this.fınal;
		
	}
	public int ortalama() {
		return (this.vize*40/100) + (this.fınal*60/100);
	
	
	
}
}

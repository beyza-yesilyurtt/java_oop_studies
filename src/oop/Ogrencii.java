package oop;

public class Ogrencii {
	 public int id;
     public String FirstName;
     public String LastName;
     public int vize;
     public int fınal;
     
     public Ogrencii(int id, String Firstname, String LastName, int vize, int fınal)
     {
         this.id = id;
         this.FirstName = Firstname;
         this.LastName = LastName;
         this.vize = vize;
         this.fınal = fınal;
     }
     public void ogrenciBilgileriGoster()
     {
         System.out.println("Öğreni no:" + id);
         System.out.println("İsim: " + FirstName);
         System.out.println("Soyisim: " + LastName);
         System.out.println("Vize notunuz: " + vize);
         System.out.println("Final notunuz: " + fınal);


     }

     public void ogrenciNotuBul()
     {
         int ortalama = ((vize * 40) / 100) + ((fınal * 60) / 100);
         System.out.println("Ortalamanız: " + ortalama);
     }
     public static void main(String[] args ) {
    	 Ogrencii ogr1 = new Ogrencii(138, "Beyza", "Yeşilyurt", 70, 60);
         ogr1.ogrenciBilgileriGoster();
         ogr1.ogrenciNotuBul();


     }
     }
 


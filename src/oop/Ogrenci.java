package oop;

public class Ogrenci {

	
		 public int id;
	        public String FirstName;
	        public String LastName;
	        public int vize;
	        public int final;

	        public Ogrenci(int id, String Firstname, String LastName, int vize, int final)
	        {
	            this.id = id;
	            this.FirstName = Firstname;
	            this.LastName = LastName;
	            this.vize = vize;
	            this.final = final;
	        }
	        public void ogrenciBilgileriGoster()
	        {
	            System.out.println("Öğreni no:" + id);
	            System.out.println("İsim: " + FirstName);
	            System.out.println("Soyisim: " + LastName);
	            System.out.println("Vize notunuz: " + vize);
	            System.out.println("Final notunuz: " + final);


	        }

	        public void ogrenciNotuBul()
	        {
	            int ortalama = ((vize * 40) / 100) + ((final * 60) / 100);
	            System.out.println("Ortalamanız: " + ortalama);
	        }
	    }
	}

	}
	}



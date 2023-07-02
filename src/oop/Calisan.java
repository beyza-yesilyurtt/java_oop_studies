package oop;

public class Calisan {
String adSoayd, eposta;
int telefon;
static int girissayisi;

public static int giris() {
	System.out.println("Kullanıcı giriş yaptı!");
	return ++Calisan.girissayisi;
}
}

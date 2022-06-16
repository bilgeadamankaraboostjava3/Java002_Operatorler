package com.muhammet;

public class Runner_Logic_Mantıksal {

	public static void main(String[] args) {
		
		// Login işlemi yapacaksınız.
		// aynı anca birden fazla ilişkyi sorgulamak gerekebilir.
		// ve &&(shift+5), veya || (altgr+"><")
		String kullanıcıadi= "admin";
		String sifre = "1234";
		boolean islogin= false;
		// VE(&&) operatöründe hem ka. hemde sf. doğru almalıyız. -> 
		islogin = kullanıcıadi == "admin" && sifre == "1234";
		System.out.println("Giriş Yapıldı mı?....: "+ islogin);
		// VEYA(||) herhangi bir ilişkinin doğru olması sonucu doğru yapar.
		// bir siteye girişi için belli kurallar olsun.
		// 10+ ise giriş yapabilir.
		// erkek değil ise giriş yapabilir
		// yaşıyor ise giriş yapabilir.
		int yas= 10;
		String cinsiyet = "K";
		boolean islive = false;
		islogin= false;
		// eğer bir değer zaten boolean üretiyor ise ayrıca true,false olduğunu irdelemeye gerek yoktur.
		islogin = yas > 10 || cinsiyet != "E" || islive;
		System.out.println("Giriş yapabilir mi?...: "+ islogin);

	}

}

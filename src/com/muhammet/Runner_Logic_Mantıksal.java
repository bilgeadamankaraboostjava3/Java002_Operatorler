package com.muhammet;

public class Runner_Logic_Mant�ksal {

	public static void main(String[] args) {
		
		// Login i�lemi yapacaks�n�z.
		// ayn� anca birden fazla ili�kyi sorgulamak gerekebilir.
		// ve &&(shift+5), veya || (altgr+"><")
		String kullan�c�adi= "admin";
		String sifre = "1234";
		boolean islogin= false;
		// VE(&&) operat�r�nde hem ka. hemde sf. do�ru almal�y�z. -> 
		islogin = kullan�c�adi == "admin" && sifre == "1234";
		System.out.println("Giri� Yap�ld� m�?....: "+ islogin);
		// VEYA(||) herhangi bir ili�kinin do�ru olmas� sonucu do�ru yapar.
		// bir siteye giri�i i�in belli kurallar olsun.
		// 10+ ise giri� yapabilir.
		// erkek de�il ise giri� yapabilir
		// ya��yor ise giri� yapabilir.
		int yas= 10;
		String cinsiyet = "K";
		boolean islive = false;
		islogin= false;
		// e�er bir de�er zaten boolean �retiyor ise ayr�ca true,false oldu�unu irdelemeye gerek yoktur.
		islogin = yas > 10 || cinsiyet != "E" || islive;
		System.out.println("Giri� yapabilir mi?...: "+ islogin);

	}

}

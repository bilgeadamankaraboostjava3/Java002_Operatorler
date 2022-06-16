package com.muhammet;

public class Runner_Artirim_Eksiltim {

	public static void main(String[] args) {

		// ++, -- Java Sýnavlarýnda çýkýyor.

		// ++, bir deðiþkenini deðerini 1 arttýrýr.
		int sayi = 1;
		sayi++; // 2
		// Eþ Kullanýmý
		sayi = sayi + 1; 
		System.out.println("Sayi Deðeri....: "+ sayi);
		// --, bir deðiþkenini deðerini 1 azaltýr.
		sayi--;
		System.out.println("Sayi Deðeri....: "+ sayi);
		// eðer ++,-- deðiþkeninin sonunda olursa deðer artýrým sonraki kullanýmda olur
		// eðer ++,-- deðiþkenini baþýnda olursa deðiþken önce artar.
		
		int s1=6,s2=8,s3=-2,toplam;
		//        6   +  9   +  9   +  -3  -  6   +  -2  +  -2
		toplam = s1++ + ++s2 + s2++ + --s3 - --s1 + ++s3 + s3++; // 11++, 
		System.out.println("s1...: "+ s1); // 6
		System.out.println("s2...: "+ s2); // 10
		System.out.println("s3...: "+ s3); // -1
		System.out.println("Toplam Nedir?.....: "+ toplam);
				
		
	}

}

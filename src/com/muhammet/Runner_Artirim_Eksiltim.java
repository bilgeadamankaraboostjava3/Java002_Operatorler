package com.muhammet;

public class Runner_Artirim_Eksiltim {

	public static void main(String[] args) {

		// ++, -- Java S�navlar�nda ��k�yor.

		// ++, bir de�i�kenini de�erini 1 artt�r�r.
		int sayi = 1;
		sayi++; // 2
		// E� Kullan�m�
		sayi = sayi + 1; 
		System.out.println("Sayi De�eri....: "+ sayi);
		// --, bir de�i�kenini de�erini 1 azalt�r.
		sayi--;
		System.out.println("Sayi De�eri....: "+ sayi);
		// e�er ++,-- de�i�keninin sonunda olursa de�er art�r�m sonraki kullan�mda olur
		// e�er ++,-- de�i�kenini ba��nda olursa de�i�ken �nce artar.
		
		int s1=6,s2=8,s3=-2,toplam;
		//        6   +  9   +  9   +  -3  -  6   +  -2  +  -2
		toplam = s1++ + ++s2 + s2++ + --s3 - --s1 + ++s3 + s3++; // 11++, 
		System.out.println("s1...: "+ s1); // 6
		System.out.println("s2...: "+ s2); // 10
		System.out.println("s3...: "+ s3); // -1
		System.out.println("Toplam Nedir?.....: "+ toplam);
				
		
	}

}

package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		/**
		 *  Temel operat�rler 
		 *  + , - , * , / , %
		 */
		int sayi1,sayi2; // ayn� anda birden fazla de�i�ken tan�mlayabilirsiniz.
		sayi1 = 4444;
		sayi2 = 4;
		int s1 = 670, s2=6;
		// TOPLAMA
		int toplam = s1 + s2;
		// �IKARTMA
		int fark = s1 - s2;
		// �ARPMA
		int carpim = s1 * s2;
		// B�LME
		int bolum = s1 / s2; // 111
		double dbolum = s1 / s2; // 111
		double ds1= 670;
		double ds2 = 6;
		double fulldb = ds1 / ds2;
		System.out.println("B�lme....: "+ bolum);
		System.out.println("Double B�lme....: "+ dbolum);
		System.out.println("Full Double B�lme....: "+ fulldb);		
		// MOD
		int moddd = sayi1 % sayi2;
		
		// 01/05/2000 -> long 
		/// zaman = 1000 * 60 * 60 * 24 * 360 * 1
		long zaman = 1000L * 60 * 60 * 24 * 360 * 9000;
		System.out.println("zaman....: "+ zaman);
	}

}

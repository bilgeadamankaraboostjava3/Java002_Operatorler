package com.muhammet;

public class Runner {

	public static void main(String[] args) {
		/**
		 *  Temel operatörler 
		 *  + , - , * , / , %
		 */
		int sayi1,sayi2; // ayný anda birden fazla deðiþken tanýmlayabilirsiniz.
		sayi1 = 4444;
		sayi2 = 4;
		int s1 = 670, s2=6;
		// TOPLAMA
		int toplam = s1 + s2;
		// ÇIKARTMA
		int fark = s1 - s2;
		// ÇARPMA
		int carpim = s1 * s2;
		// BÖLME
		int bolum = s1 / s2; // 111
		double dbolum = s1 / s2; // 111
		double ds1= 670;
		double ds2 = 6;
		double fulldb = ds1 / ds2;
		System.out.println("Bölme....: "+ bolum);
		System.out.println("Double Bölme....: "+ dbolum);
		System.out.println("Full Double Bölme....: "+ fulldb);		
		// MOD
		int moddd = sayi1 % sayi2;
		
		// 01/05/2000 -> long 
		/// zaman = 1000 * 60 * 60 * 24 * 360 * 1
		long zaman = 1000L * 60 * 60 * 24 * 360 * 9000;
		System.out.println("zaman....: "+ zaman);
	}

}

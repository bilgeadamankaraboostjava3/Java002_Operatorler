package com.muhammet;

import java.util.Scanner;

public class Runner_AritmetikOrnek {

	public static void main(String[] args) {
		
		int vize_notu,final_notu,ortalama;
		
		System.out.println("**************************");
		System.out.println("****AR�TMET�K ��LEMLER****");
		System.out.println("**************************");
		System.out.println();
		/**
		 * Scanner -> I/O 
		 * Sistemde yap�lan girdileri tarar.
		 */		
		Scanner sc = new Scanner(System.in);
		System.out.print("Vize Notunu giriniz....: ");
		vize_notu = sc.nextInt(); // hataya a��kt�r. burada say�sal bir de�er bekliyoruz
								 // ancak kullan�c� 5 yerine be� yazarsa ne olur?? HATA OLUR
		System.out.print("Fina Notunu  giriniz....: ");
		
		final_notu = sc.nextInt();
		ortalama = (vize_notu+final_notu)/2;
		System.out.println("Ortalama.....: "+ ortalama);
		// vize-> %40, final -> %60
		ortalama = (int)(vize_notu*0.4 + final_notu*.6);
		System.out.println("Ortalama.....: "+ ortalama);
	}

}

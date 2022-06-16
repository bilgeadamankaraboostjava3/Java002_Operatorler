package com.muhammet;

public class Runner_Relational_Ýliskisel {

	public static void main(String[] args) {
		// ln -> line kullanýmý
		/*
		System.out.print("Ahmet");
		System.out.print("Zeynep");
		System.out.print("Büþra");
		System.out.println("Diðer Kiþiler");
		System.out.println("Büþra");
		
		System.out.print("Büþra");
		System.out.println("vize giriniz...: ");
		 */
		// true - false = boolean
		int ortalama = 40;
		boolean durum;
		durum = ortalama > 50; // ortalama 50 den büyük müdür? hayýr -> false
		System.out.println("Durum...: "+ durum);
		/**
		 *  == -> iki deðiþkenin eþitliðini sorgular		 * 
		 *  != -> iki dðeiþkenin eþit olmama durumunu sorgular
		 *  <  -> iki deðiþkenden soldakinin saðda olandan küçük olma durumun sorgular
		 *  >  -> iki deðiþkenden soldakinin saðda olandan büyük olma durumun sorgular
		 *  >= -> 
		 *  <= -> 
		 */
		durum = ortalama >=50; // 
		durum = ortalama == 50; // ortalama 50 ye eþit midir? // hayýr, false
		durum = ortalama != 50; // ortalama 50 eþit deðil midir? evet, true
	}

}

package com.muhammet;

public class Runner_Relational_�liskisel {

	public static void main(String[] args) {
		// ln -> line kullan�m�
		/*
		System.out.print("Ahmet");
		System.out.print("Zeynep");
		System.out.print("B��ra");
		System.out.println("Di�er Ki�iler");
		System.out.println("B��ra");
		
		System.out.print("B��ra");
		System.out.println("vize giriniz...: ");
		 */
		// true - false = boolean
		int ortalama = 40;
		boolean durum;
		durum = ortalama > 50; // ortalama 50 den b�y�k m�d�r? hay�r -> false
		System.out.println("Durum...: "+ durum);
		/**
		 *  == -> iki de�i�kenin e�itli�ini sorgular		 * 
		 *  != -> iki d�ei�kenin e�it olmama durumunu sorgular
		 *  <  -> iki de�i�kenden soldakinin sa�da olandan k���k olma durumun sorgular
		 *  >  -> iki de�i�kenden soldakinin sa�da olandan b�y�k olma durumun sorgular
		 *  >= -> 
		 *  <= -> 
		 */
		durum = ortalama >=50; // 
		durum = ortalama == 50; // ortalama 50 ye e�it midir? // hay�r, false
		durum = ortalama != 50; // ortalama 50 e�it de�il midir? evet, true
	}

}

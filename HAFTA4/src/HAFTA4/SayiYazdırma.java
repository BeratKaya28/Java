package HAFTA4;

import java.util.Scanner;

public class SayiYazdırma {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("İki basamaklı sayı giriniz");
		int sayi = scanner.nextInt();
		
		int birler = sayi%10;
		int onlar = sayi/10;
		
		switch(onlar) {
		
		case 1:
			System.out.println("On");
			break;
			
			
		case 2:
			System.out.println("Yirmi");
			break;
			
			
		case 3:
			System.out.println("Otuz");
			break;
			
			
		case 4:
			System.out.println("Kırk");
			break;
			
			
		case 5:
			System.out.println("Elli");
			break;
			
			
		case 6:
			System.out.println("Altmış");
			break;
			
			
		case 7:
			System.out.println("Yetmiş");
			break;
			
			
		case 8:
			System.out.println("Seksen");
			break;
			
		case 9:
			System.out.println("Doksan");
			break;
			
			
		} switch(birler) {
		
		case 1:
			System.out.println("Bir");
			break;
			
			
		case 2:
			System.out.println("İki");
			break;
			
			
		case 3:
			System.out.println("Üç");
			break;
			
			
		case 4:
			System.out.println("Dört");
			break;
			
			
		case 5:
			System.out.println("Beş");
			break;
			
			
		case 6:
			System.out.println("Altı");
			break;
			
			
		case 7:
			System.out.println("Yedi");
			break;
			
			
		case 8:
			System.out.println("Sekiz");
			break;
			
		case 9:
			System.out.println("Dokuz");
			break;
			
			
		}

	}

}

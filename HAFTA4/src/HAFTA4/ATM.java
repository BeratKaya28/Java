package HAFTA4;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int bakiye =5000;
		System.out.println("Bakiyeniz: "+bakiye);
		System.out.println("1.Para Çekme\n2.Para Yatırma\n3.Bakiye Sorgulama\n4.Kart İade");
		System.out.println("İşlem seçiniz: ");
		int islem = scanner.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("Çekmek istediğiniz tutar: ");
			int tutar = scanner.nextInt();
			if(tutar>bakiye) {
				System.out.println("Yetersiz bakiye. Tekrar deneyiniz: ");
				tutar = scanner.nextInt();
				
			}
			bakiye -=tutar;
			System.out.println("Yeni bakiyeniz: "+bakiye);
			break;
		case 2:
			System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
			tutar = scanner.nextInt();
			bakiye += tutar;
			System.out.println("Yeni bakiyeniz: "+bakiye);
			break;
			
		case 3:
			System.out.println("Mevcut Bakiyeniz: "+bakiye);
			break;
			
		case 4:
			System.out.println("Kartınızı almayı unutmayınız.");
			break;
			default:
				System.out.println("Yalnış işlem seçtiniz.");
			
		}

	}

}

package HAFTA4;

import java.util.Scanner;

public class DeğişkenDeğiştirme {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x, y;
		System.out.println("Birinci sayıyı giriniz: ");
		x = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		y = scanner.nextInt();
		System.out.println("Değiştirilmeden önce: ");
		System.out.println("Birinci sayı: "+x+"\n İkinci sayı: "+y);
		
		int a = x;
		x = y;
		y = a;
		System.out.println("Değiştirildikten sonra: ");
		System.out.println("Birinci sayı: "+x+"\n İkinci sayı: "+y);

	}

}

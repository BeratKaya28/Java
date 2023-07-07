package HAFTA4;

import java.util.Scanner;

public class MaxSayiyiBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		System.out.println("Birinci sayıyı giriniz: ");
		x = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		y = scanner.nextInt();
		System.out.println("Üçüncü sayıyı giriniz: ");
		z = scanner.nextInt();
		
		int max;
		
		if (x<y &&z<y) {
			System.out.println("En büyük sayı: "+y);
		}
		else if (y<x &&z<x) {
			System.out.println("En büyük sayı: "+x);
		}else {
			System.out.println("En büyük sayı: "+z);
		}
		

	}

}

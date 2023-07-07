package HAFTA4;

import java.util.Scanner;

public class YakitTutari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aracınız kaç kurus yakıyor: ");
		double kurus = scanner.nextDouble();
		System.out.println("Aracınızla ne kadar gittiniz: ");
		int km = scanner.nextInt();
		System.out.println("Toplam ödemeniz "+(kurus*km)+ "TL'dir.");

	}

}

package HAFTA4;

import java.util.Scanner;

public class KokBulma {

	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		
		System.out.println("a: ");
		a =giriş.nextDouble();
		System.out.println("b: ");
		b =giriş.nextDouble();
		System.out.println("c: ");
		c =giriş.nextDouble();
		
		delta = b*b-4*a*c;
		if (delta<0) {
			System.out.println("Reel kökü yoktur. ");
		}
		else if (delta == 0 ) {
			x1 = -b/(2*a);
					System.out.println("Çift kat kök vardır. "+"\n x1 = x2"+x1);
			
		}
		else {
			x1 =(-b + Math.sqrt(delta))/(2*a);
			x2 =(-b - Math.sqrt(delta))/(2*a);
			System.out.println("İki farklı reel kök vardır."+"\n x1 = "+x1+"\n x2 = "+x2);
		}
	
		
	
	
	
	
	}

}

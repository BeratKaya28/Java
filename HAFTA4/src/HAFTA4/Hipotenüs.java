package HAFTA4;

import java.util.Scanner;

public class Hipotenüs {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int a, b;
	  System.out.println("Birinci kenar: ");
	  a =scanner.nextInt();
	  System.out.println("İkinci kenar: ");
	  b =scanner.nextInt();
	  double h = Math.sqrt(a*a+b*b);
	  System.out.println("Hipotenüs: "+h);
	

	}

}

package hafta1;

import java.util.Scanner;

public class HesapMakinası {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, sonuc;

		System.out.println("Birinci sayıyı giriniz: ");
		a = scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		b = scanner.nextInt();
byte menu;
		for (;;) {
         MenuGörüntule();
         menu=scanner.nextByte();
         switch(menu) {
         case 1:
        	 sonuc=a+b;
        	 System.out.println(a+" + "+b+" = "+sonuc);
        	 break;
        	 
         case 2:
        	 sonuc= a-b;
        	 System.out.println(a+" - "+b+" = "+sonuc);
        	 break;
        	 
         case 3:
        	 sonuc=a*b;
        	 System.out.println(a+" + "+b+" = "+sonuc);
        	 
        	 break;
        	 
         case 4:
        	 sonuc=a/b;
        	 System.out.println(a+" / "+b+" = "+sonuc);
        	 break;
        	 
         case 5:
        	 sonuc=a%b;
        	 System.out.println(a+" % "+b+" = "+sonuc);
        	 break;
        	
         case 6:
        	 System.out.println("Program bitti");
        	 System.exit(0);
        	 break;
        	 
        	 default:
        		 System.out.println("Yalnış değer girdiniz");
        	 break;
         }
         
         
         
		}

	}

	private static void MenuGörüntule() {
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod alma\n6-Çıkış\nSeçiminiz: ");
		
	}

}

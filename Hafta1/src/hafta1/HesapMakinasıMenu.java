package hafta1;

import java.util.Scanner;

public class HesapMakinasıMenu {

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
        	 sonuc=Toplama(a,b);
        	 System.out.println(a+" + "+b+" = "+sonuc);
        	 break;
        	 
         case 2:
        	 sonuc= Çıkarma(a,b);
        	 System.out.println(a+" - "+b+" = "+sonuc);
        	 break;
        	 
         case 3:
        	 sonuc=Çarpma (a,b);
        	 System.out.println(a+" + "+b+" = "+sonuc);
        	 
        	 break;
        	 
         case 4:
        	 sonuc=Bölme(a,b);
        	 System.out.println(a+" / "+b+" = "+sonuc);
        	 break;
        	 
         case 5:
        	 sonuc=Method(a,b);
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

	private static int Bölme(int a , int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	private static int Method(int a, int b) {
		// TODO Auto-generated method stub
		return a%b;
	}

	private static int Çarpma(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	private static int Çıkarma(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	private static int Toplama(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	
	private static void MenuGörüntule() {
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod alma\n6-Çıkış\nSeçiminiz: ");
		
	}

}

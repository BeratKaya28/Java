package hafta1;

import java.util.Scanner;

public class SınavNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        byte vizeNot=scanner.nextByte();
        System.out.println("Final not: ");
        byte finalNot=scanner.nextByte();
        byte basariNot;
        byte menu;
        	while(true) {
        		MenuAl();
        		menu=scanner.nextByte();
        		switch(menu) {
        		case 1:
        			basariNot=(byte) OtuzYetmiş(vizeNot, finalNot);
        			System.out.println("Otuz Yetmişe Göre Hesaplandı");
        			System.out.println("Basarı notunuz: "+basariNot);
        			
        			break;
        			
        		case 2:
        			basariNot = KırkAltmış(vizeNot,finalNot);
        			System.out.println("Kırk Altmışa Göre Hesaplandı");
        			System.out.println("Başarı Notunuz: "+basariNot);
        			break;
        			
        		case 3:
        			basariNot = ElliElli(vizeNot,finalNot);
        			System.out.println("Elliye Elli Olarak Hesaplandı");
        			System.out.println("Basari NOtunuz: "+basariNot);
        			break;
        		}
        		
        		
        	}
		
		
		
	}

	private static byte ElliElli(byte vizeNot, byte finalNot) {
		// TODO Auto-generated method stub
		return (byte)(vizeNot*0.5+finalNot*0.5);
	}

	private static byte KırkAltmış(byte vizeNot, byte finalNot) {
		// TODO Auto-generated method stub
		return (byte)(vizeNot*0.4 + finalNot*0.7);
	}

	private static Object OtuzYetmiş(byte vizeNot, byte finalNot) {
		// TODO Auto-generated method stub
		return (byte)(vizeNot*0.3 + finalNot*0.7);
	}

	private static void MenuAl() {
		System.out.println("1-%30-%70\n2-%40-%60\n3-%50-%50");
		
	}

}

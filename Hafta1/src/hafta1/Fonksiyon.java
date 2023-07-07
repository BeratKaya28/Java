package hafta1;

public class Fonksiyon {

	

	public static void main(String[] args) {
		Goruntule();
		Goruntule();
		Goruntule();
		int a=5 , b=6;
		Toplama(a,b);
		int sonuc=Toplam(a,b);
		System.out.println(a+" + "+b+" = "+sonuc);
		int x=(int)Math.sqrt(25);
		System.out.println("25 in kare kökü: "+x);
		

	}
	
	private static int Toplam(int a, int b) {
		/*
		int s=a+b;
		return s;
		*/
		return a+b;
	}

	private static void Toplama(int a1, int b1) {
		System.out.println(a1+" + "+b1+" = "+(a1+b1));
	}
	
	
	
	private static void Goruntule() {
		System.out.println("Okan Universitesi");
	}
	
	

}

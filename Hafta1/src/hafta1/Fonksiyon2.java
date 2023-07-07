package hafta1;

public class Fonksiyon2 {

	public static void main(String[] args) {
		int a=5, b=2, c=4, d=10;
		Toplama(a,b);
		Toplama(a,b,c);
        double a1=2.5, b1=3.7, c1=5.2;
        Toplama(a1, b1);
		Toplama(a1, b1, c1);
	}

	private static void Toplama(double a1, double b1, double c1) {
		System.out.println("Üç paremetreli");
		System.out.println(a1+" + "+b1+" + "+c1+" = "+(a1+b1+c1));
	}

	private static void Toplama(double a1, double b1) {
		System.out.println("İki parametreli fonksiyon");
		System.out.println(a1+" + "+b1+" = "+(a1+b1));
	}

}

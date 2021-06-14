package exprogDiciembre1Ev;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(esBisiesto(1904));
		System.out.println(esBisiesto(1400));
		System.out.println(esBisiesto(1600));
		System.out.println(esBisiesto(1913));
	}

	static boolean esBisiesto(int a) {
		boolean d4 = a % 4 == 0;
		boolean d100 = a % 100 == 0;
		boolean d400 = a % 400 == 0;
		return d4 && (!d100 || d400);
	}
}

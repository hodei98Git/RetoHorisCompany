//package ejercicios;

public class Ejercicio1 {

	public static int suma(int x, int y) {
		return x + y;

	}

	public static void main(String[] args) {

		int x = 0;
		int y = 2;
		int resultado = 0;
		resultado = Ejercicio1.suma(2, 1);
		System.out.println(x + "+" + y + "=" + resultado);
		for (int i = 0; i < 3; i++) {
			resultado = resultado + i;

		}
		System.out.println(resultado);
	}

}
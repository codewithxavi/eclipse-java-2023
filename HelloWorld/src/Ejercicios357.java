import java.util.Scanner;

public final class Ejercicios357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio: escribe un programa que imprima toda la tabla de multiplicar del 5
		// (desde 0 hasta 10).
		// Ejercicio: escribe un programa que imprima todas las tablas de multiplicar
		// del 1 al 9 (desde 0 hasta 10).
		// Ejercicio: escribe un programa que dado un número, sume dicho número con
		// todos los anteriores. Por ejemplo, para el número 5 el resultado debería ser
		// 15 (5 + 4 + 3 + 2 + 1).
		// Ejercicio: escribe un programa que dado un número, calcule si es primo o no.
		// Un número primo es un número natural mayor que 1 que tiene únicamente dos
		// divisores distintos: él mismo y el 1.

		// GenerarMultiplicaDel5();
		// GeneraTodaTablaMultiplicar();
		// SumarAnteriores();
		// ObtenerPrimo();

	}

	public static void GenerarMultiplicaDel5() {
		for (int i = 0; i <= 10; i++) {
			int numero = 5;
			int resultado = numero * i;
			System.out.println("Tabla de multiplicar del 5");
			System.out.println(numero + "*" + i + "=" + resultado);
		}
	}

	public static void GeneraTodaTablaMultiplicar() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				int result = i * j;
				System.out.println(i + "*" + j + "=" + result);
			}
		}
	}

	public static void SumarAnteriores() {
		int num = 5;
		int suma = 0;
		for (int i = num; i >= 1; i--) {
			suma += i;
		}

		System.out.println("La suma de " + num + " y todos los números anteriores es " + suma);
	}

	public static void ObtenerPrimo() {
		int num = 1;

		if (num <= 1) {
			System.out.println(num + " no es primo");
			return;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " no es primo");
				break;
			} else {
				System.out.println(num + " es primo");
				break;
			}
		}

	}

	public static void ObtenerPrimo2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escribe un numero:");

		int numero = keyboard.nextInt();
		keyboard.close();

		int i = 2;

		while (numero % i != 0 && i < numero - 1) {
			i++;
		}

		if (i == numero - 1 || numero == 2) {
			System.out.println("El numero es primo");
		} else if (numero <= 1) {
			System.out.println("Has puesto un 0, un 1 o un numero negativo");
		} else {
			System.out.println("El numero no es primo");
		}
	}
}

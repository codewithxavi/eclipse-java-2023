
public class Ejercicios344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio: escribe un programa con cuatro variables de tipo entero (a, b, c y d) y uncondicional que imprima por pantalla si la suma de a y b es mayor que la suma de c y d.
		int a = 2, b = 3, c = 4, d = 5;

		if (a + b > c + d) {
			System.out.println("La suma de a y b es mayor que la suma de c y d");
		} else {
			System.out.println("La suma de a y b es menor que la suma de c y d");
		}

//		Ejercicio: escribe un programa que almacene tres ángulos de un triángulo en variables de tipo entero (angulo1, angulo2 y angulo3). Crea un condicional que compruebe si esostres ángulos juntos pueden formar un triángulo (los ángulos de un triángulo sumansiempre 180 grados).
		int angulo1 = 45, angulo2 = 45, angulo3 = 90;
		if (angulo1 + angulo2 + angulo3 == 180) {
			System.out.println("Puede formar un triángulo");
		} else {
			System.out.println("No puede formar un triángulo");
		}

//		
//		Ejercicio: escribe un programa con una variable de tipo entero (a) y un condicional queevalúe si el entero es par o impar utilizando el operador %.

		int par = 2;
		if (par % 2 == 0) {
			System.out.println("El número " + a + " es un número par");
		} else {
			System.out.println("El número " + a + " es un número impar");
		}

		int i = 23;
		if (i == 25) {
			System.out.println("a");
		} else if (i == 24) {
			System.out.println("b");
		} else {
			System.out.println("c");
		}
		if (i == 24) {
			System.out.println("d");
		} else {
			System.out.println("e");
		}
		if (i == 22) {
			System.out.println("f");
		} else if (i == 25) {
			System.out.println("g");
		} else {
			System.out.println("h");
		}

	}

	public static int[] obtenerMultiplos(int numero, int elementos) {
		int[] multiplos = new int[elementos];
		for (int i = 0; i < elementos; i++) {
			multiplos[i] = numero * (i + 1);
		}
		return multiplos;
	}

}

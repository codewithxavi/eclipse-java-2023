public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Holá mon");
		System.out.println("Hello World");
		System.out.println("2*3");
		System.out.printf("%d %d %d", 5, 7, 5);
		System.out.println();
		int result = 2*3;
		System.out.printf("El resultado de la expresion 2*3 es %d", result);
		System.out.println();
		System.out.println(3*2);
		
		// Ejercicio: imprime por pantalla 5 + 6 + 7 = 18
		System.out.printf("5 + 6 + 7 = %d ", 5+6+7).println();
		System.out.printf("%d + %d + %d = %d", 5,6,7,5+6+7).println();
		
		System.out.printf("5.5 + 6.5 + 7.5 = %f ", 5.5+6.5+7.5).println();
		System.out.printf("%f + %f + %f = %f", 5.5,6.5,7.5,5.5+6.5+7.5).println();
		
		// variables declaradas correctamente
		int E378a = 3;
		int A3d = 3;
		int asDas_d$ = 4;
		
		// asignaciones
		int d = 5;
		int e = d;
		int f = d + e;
		System.out.printf("%d + %d = %d", d, e, f).println();
		
		// las tres variables declaradas son de tipo entero
		int _a = 1, _b = 2, _c = 1;
		// Escribe un programa que declare tres variables de nombre a, b y c con valores de tipo entero
		int a=10, b=20, c=30, resultadoEnteros=a+b+c;
		System.out.println("La suma de "+a+"+" + b + "+" + c + " es " + resultadoEnteros);
		c=50;
		System.out.printf("%d + %d + %d = %d ", a,b,c,a+b+c).println();
		
		byte __b = 5;
		short s = 128;
		int i = 40000; 
		long l = 2222222222L; // en variables de tipo long hay que añadir el carácter L al final del número
		
		// calcular la cantidad de minutos en un día
		int minutes = 60*24;
		System.out.printf("La cantidad de minutos en un dia son: %d", minutes).println();
		// calcular la cantidad de segundos en un día
		int seconds = 60*60*24;
		System.out.printf("La cantidad de segundos en un dia son: %d", seconds).println();
	}

}


public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 100;// short < double (casting)
		short s = (short) d;// byte < double (casting)
		byte b = (byte) d;// 100.0
		System.out.println(d);// 100
		System.out.println(s);// 100
		System.out.println(b);
		
		short n1 = 88;
		char c1 = (char) n1;// X
		System.out.println(c1);
		
		char c2 = 'a';
		short n2 = (short) c2;// 97
		System.out.println(n2);
		
		
		for(int i = 0; i<=255; i++) {
			char letter = (char)i;
			System.out.print(letter);
		}
		
		// Ejercicio: escribe un programa con cuatro variables de tipo entero (a, b, c y d) y uncondicional que imprima por pantalla si la suma de a y b es mayor que la suma de c y d.
		
		
	}

}

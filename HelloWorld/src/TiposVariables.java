
public class TiposVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 5;
		short s = 128;
		int i = 40000;
		
		long l = 2222222222222L;
		long longo = 2147483647L;
		int j = 2147483647;
		
		// el valor de j es incrementado
		j = j + 1;
		System.out.println(j);
		
		int x = (!true) ? 4 : 3;
		System.out.println(x);
		
//		Ejercicio: elige el tipo de variable adecuada para almacenar los siguientes datos:1. El número de goles en un partido de fútbol.2. El número de personas que viven en el mundo.3. La letra del DNI.4. Si una bombilla está encendida o apagada.5. El precio de una barra de pan.6. La distancia existente entre planetas.
		
		int ii = 100;// long > int (conversión automática)
		long ll = ii;// float > long (conversión automática)
		float f = l;// 100
		System.out.println(ii);// 100
		System.out.println(ll);// 100.0
		System.out.println(f);
		
		
	}

}

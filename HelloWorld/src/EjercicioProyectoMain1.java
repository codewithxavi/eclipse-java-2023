import java.util.Scanner;

public class EjercicioProyectoMain1 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	     String opcion = "";


	     while (!opcion.equals("S")) {
	            System.out.println("1 --> Gestores");
	            System.out.println("2 --> Clientes");
	            System.out.println("3 --> Transferencias");
	            System.out.println("4 --> Mensajes");
	            System.out.println("5 --> Préstamos");
	            System.out.println("S --> Salir");
	            
	            System.out.println("Ingrese un número (opción):");
	            opcion = scanner.nextLine();

	            switch (opcion) {
	                case "1":
	                    System.out.println("Ha seleccionado Gestores.");
	                    break;
	                case "2":
	                    System.out.println("Ha seleccionado Clientes.");
	                    break;
	                case "3":
	                    System.out.println("Ha seleccionado Transferencias.");
	                    break;
	                case "4":
	                    System.out.println("Ha seleccionado Mensajes.");
	                    break;
	                case "5":
	                    System.out.println("Ha seleccionado Préstamos.");
	                    break;
	                case "S":
	                    System.out.println("Ha salido del programa.");
	                    break;
	                default:
	                    System.out.println("Opción inválida.");
	                    break;
	            }
	     }
	     
	     scanner.close();
	     
//		switch (numero) {
//		  case 1:
//		    System.out.println("Gestores");
//		    break;
//		  case 2:
//		    System.out.println("Clientes");
//		    break;
//		  case 3:
//		    System.out.println("Transferencias");
//		    break;
//		  case 4:
//		    System.out.println("Mensajes");
//		    break;
//		  case 5:
//		    System.out.println("Prestamos");
//		    break;
//		  case 6:
//		    System.out.println("Salir");
//		    break;
//		}

//		if (numero == 1) {
//			System.out.println("Gestores");
//		} else if (numero == 2) {
//			System.out.println("Clientes");
//		}
//		else if (numero == 3) {
//			System.out.println("Transferencias");
//		}
//		else if (numero == 4) {
//			System.out.println("Mensajes");
//		}
//		else if (numero == 5) {
//			System.out.println("Préstamos");
//		}
//		else {
//			System.out.println("Salir");
//		}

		
	}

}

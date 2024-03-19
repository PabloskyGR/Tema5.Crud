package ejercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza[] pizzas = new Pizza[50];
		int numPizzas = 0;
		int opc = 0;
		int codigo;
		String tamaño;
		String tipo;
		int codigoServida;

		while (opc != 4) {
			menu();
			System.out.print("Dime que quieres realizar: ");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				System.out.println("Listado de pizzas:");
				for (int i = 0; i < numPizzas; i++) {
					System.out.println(pizzas[i]);
				}
				break;
			case 2:
				if (numPizzas < 50) {
					System.out.println("Dime el código de la pizza: ");
					codigo = sc.nextInt();
					System.out.print("Dime el tamaño (Mediana/Familiar): ");
					tamaño = sc.next();
					sc.nextLine();
					System.out.print("Dime el tipo: ");
					tipo = sc.nextLine();
					pizzas[numPizzas] = new Pizza(codigo, tamaño, tipo);
					numPizzas++;
					System.out.println("Pizza registrada con éxito.");
				} else {
					System.out.println("La cola esta llena ya");
				}
				break;
			case 3:
				System.out.print("dime el código de la pizza que estará servida: ");
				codigoServida = sc.nextInt();
				boolean pizzaEncontrada = false;
				for (int i = 0; i < numPizzas; i++) {
					if (pizzas[i].getCodigo() == codigoServida) {
						pizzas[i].setEstado("Servida");
						pizzaEncontrada = true;
						System.out.println("Pizza marcada como servida.");
						break;
					}
				}
				if (!pizzaEncontrada) {
					System.out.println("No se encontro ninguna pizza con ese código");
				}
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		}
		sc.close();
	}

	public static void menu() {
		System.out.println("| - - - - Menú - - - -  |");
		System.out.println("|  1. Listado de pizzas |");
		System.out.println("|  2. Nuevo pedido      |");
		System.out.println("|  3. Pizza servida     |");
		System.out.println("|  4. Salir             |");
		System.out.println("| - - - - - - - - - - - |");
	}

}

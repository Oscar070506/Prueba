import java.util.InputMismatchException;

import java.util.Scanner;

public class Consola {

	private static Scanner entrada = new Scanner(System.in);

	public static int leerInt(String mensajeError) {

		System.out.println("Escribe tu edad:");
		boolean esEntero = false;
		int num = 0;

		while (!esEntero) {
			try {

				num = entrada.nextInt();
				esEntero = true;

			} catch (InputMismatchException ime) {
				System.out.println(mensajeError);
				entrada.nextLine();

			}
		}

		System.out.print("\nTu edad es " + num + ".");
		return num;

	}

	public static int leerInt() {

		System.out.println("Escribe tu edad: ");
		boolean num = false;
		while (!num) {

			try {
				num = entrada.hasNextInt();
				num = true;

			} catch (InputMismatchException ime) {
				System.out.println("Entrada incorrecta: se esperaba un número entero");
				entrada.nextLine();
			}
		}

		System.out.print("\nTu edad es " + num + ".");

		return 0;
	}

}

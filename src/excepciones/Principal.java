package excepciones;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerador = 10, denominador = 1;
		double resultado;

		do {
			try {

				System.out.println("Introduzca el numerador");
				numerador = Leer.datoInt();
				System.out.println("Introduzca el denominador");
				denominador = Leer.datoInt();
				resultado = numerador / denominador;
				System.out.printf("La division es: %.2f\n", resultado);

			} catch (ArithmeticException a) {
				System.out.println("!Está usted dividiendo por cero!");
			} catch (NumberFormatException n) {
				System.out.println("Dato no valido");
			} catch (Exception e) {
				System.out.println("!Error inesperado!");
			}
		} while (denominador != 0);
	}

}

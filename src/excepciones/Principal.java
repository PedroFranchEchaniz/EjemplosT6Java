package excepciones;

import java.util.StringJoiner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numerador = 10, denominador = 1;
		double resultado;
		
		
		do {
			
			System.out.println("El denominador no puede ser 0");
		}while (denominador == 0);
		
		resultado=numerador/denominador;
		System.out.printf("%.2f\n" ,resultado);
		
		
		
		
	}	

}

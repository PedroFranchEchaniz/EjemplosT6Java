package ejercicios;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int div, divi, raiz, respuesta = 0;
		double resul;
		
		do {
						
			System.out.println("4-Dividir");
			System.out.println("5-Raiz");
			System.out.println("0-Salir");
			
			try {
			respuesta=Leer.datoInt();			
			switch(respuesta) {
				case(4):
					System.out.println("Indique el numerador");
					div=Leer.datoInt();
					System.out.println("Indique el denominador");
					divi=Leer.datoInt();
					resul=div/divi;
					System.out.println(resul);
					break;
				case(5):
					System.out.println("Indique el numero");
					raiz=Leer.datoInt();
					resul = Math.sqrt(respuesta);
					System.out.println(resul);
					break;
				case(0):
					System.out.println("Saliendo");
					break;				
			}
			
			}catch (ArithmeticException e) {
				System.out.println("¡Error estas dividiendo entre 0!");
			}catch (NumberFormatException e) {
				System.out.println("¡No metas letritas que era un númerito!");
			}catch (Exception e) {
				System.out.println("¡Error INESPERADO!");
			}	
		}while(respuesta != 0);
	}

}

package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tempF=0, tempG=-273;
		String aux;
		Scanner sc = new Scanner(System.in);
		Termometro t = new Termometro();
		
		
		do {
			try {
			System.out.println("Introduzca grados");
			aux=sc.nextLine();
			tempG = Double.parseDouble(aux);
			tempF=t.temperaturaGrado(tempG);
			System.out.println(tempF);
			}catch(ControlError o) {
				System.out.println(o.getMessage());
			}catch(NumberFormatException e) {
				System.out.println("¡No metas letritas que era un númerito!");
			}		
			
		}while(tempF >= -273);
		
	}

}

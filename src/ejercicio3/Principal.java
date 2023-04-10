package ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		CEcuacion2Grado ce = new CEcuacion2Grado();
		
		double a, b, c;
		String aux;
		
		try {
		System.out.println("Introduca el primer número");
		aux=sc.nextLine();
		a = Double.parseDouble(aux);
		
		System.out.println("Introduzca el segundo número");
		aux=sc.nextLine();
		b=Double.parseDouble(aux);
		
		System.out.println("Introduzca el tercer número");
		aux=sc.nextLine();
		c=Double.parseDouble(aux);
		
		System.out.println(ce.resolver1(a, b, c));
		System.out.println(ce.resolver2(a, b, c));
		
		}catch(Error o) {
			System.out.println(o.getMessage());			
		}catch(Error2 e) {
			System.out.println(e.getMessage());			
		}
		
		
		
	}

}

package ejercicio3;

public class CEcuacion2Grado {

	private double a;
	private double b;
	private double c;
	
	public CEcuacion2Grado() {
		
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "CEcuacion2Grado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public double resolver1(double a, double b, double c) throws Error, Error2{
		double discriminante, x1;		
		if(a == 0 && b == 0) {
			throw new Error ("Ecuación denegada");
		}
		discriminante = b*b-4*a*c;
		if(discriminante <0) {
			throw new Error2 ("Las raices son complejas");
		}else {
			x1 = (-b + Math.sqrt(discriminante))/2*a;
		}
		return x1;
	}
	
	public double resolver2(double a, double b, double c) throws Error, Error2{
		double discriminante, x2;		
		if(a == 0 && b == 0) {
			throw new Error ("Ecuación denegada");
		}
		discriminante = b*b-4*a*c;
		if(discriminante <0) {
			throw new Error2 ("Las raices son complejas");
		}else {
			x2 = (-b - Math.sqrt(discriminante))/2*a;
		}
		return x2;
	}
	
	
}

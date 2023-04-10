package ejercicio2;

public class Termometro {
	
	private double temperatura;

	public Termometro(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public Termometro() {
		
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String toString() {
		return "termometro [temperatura=" + temperatura + "]";
	}
	public double temperaturaGrado(double temp) throws ControlError {
		double resul;
		resul = temp * 9/5 +35;
		 if(resul<= -273)
			 throw new ControlError ("La temperatura no puede ser nenor de cero absoluto");
		else
			return resul;
	}
	

}

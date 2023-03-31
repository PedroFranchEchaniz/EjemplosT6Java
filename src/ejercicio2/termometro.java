package ejercicio2;

public class termometro extends GestionError {
	
	private double temperatura;

	public termometro(double temperatura) {
		super();
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "termometro [temperatura=" + temperatura + "]";
	}
	
	

}

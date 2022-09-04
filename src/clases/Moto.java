package clases;

public class Moto extends Vehiculo {
	
	
	private int espejos;
	private int VELOCIDAD_FINAL = 160;
	
	private final String ANSI_WHITE = "\u001B[37m";
	public final String ANSI_GREEN = "\u001B[32m";
	public final String ANSI_YELLOW = "\u001B[33m";

	public Moto(int velocidad, int espejos) {
		super(velocidad);
		this.espejos = espejos;
	}

	public int getEspejos() {
		return espejos;
	}

	public void setEspejos(int espejos) {
		this.espejos = espejos;
	}

	@Override
	public Boolean esSeguro() {
		if(velocidad < VELOCIDAD_FINAL && espejos >= 2) {
			System.out.println(ANSI_GREEN + "La moto es segura" + ANSI_WHITE);
			return true;
		}
		System.out.println(ANSI_YELLOW + "La moto NO es segura" + ANSI_WHITE);
		return false;
	}

	@Override
	public String toString() {
		return "Moto [velocidad=" + velocidad + ", espejos=" + espejos + "]";
	}
	

}

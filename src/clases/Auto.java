package clases;

public class Auto extends Vehiculo {
	
	private boolean tieneRuedaAuxilio;
	private final int FACTOR_VELOCIDAD = 100;
	private final int VELOCIDAD_FINAL = 140;
	
	private final String ANSI_WHITE = "\u001B[37m";
	public final String ANSI_RED = "\u001B[31m";
	public final String ANSI_GREEN = "\u001B[32m";
	public final String ANSI_YELLOW = "\u001B[33m";
	

	public Auto(int velocidad, boolean tieneRuedaAuxilio) {
		super(velocidad);
		this.tieneRuedaAuxilio = tieneRuedaAuxilio;
	}

	public boolean isTieneRuedaAuxilio() {
		return tieneRuedaAuxilio;
	}

	public void setTieneRuedaAuxilio(boolean tieneRuedaAuxilio) {
		this.tieneRuedaAuxilio = tieneRuedaAuxilio;
	}
	
	
	@Override
	public int getVelocidad() {		
		return super.getVelocidad() + FACTOR_VELOCIDAD;
	}

	@Override
	public Boolean esSeguro() {
		boolean velocidaFinal = (velocidad + FACTOR_VELOCIDAD < VELOCIDAD_FINAL) ? true : false;
		if (tieneRuedaAuxilio && velocidaFinal) {
			System.out.println(ANSI_GREEN + "Es auto es seguro" + ANSI_WHITE);
			return true;
		}
		System.out.println(ANSI_YELLOW + "Es auto NO es seguro" + ANSI_WHITE);
		return false;
		
	}

	@Override
	public String toString() {
		return "Auto [tieneRuedaAuxilio=" + tieneRuedaAuxilio + ", velocidad=" + velocidad + "]";
	}
 

}

package clases;

public class Conductor {
	
	private Auto auto;
	private Moto moto;
	private boolean tieneRegistro;
	
	private final String ANSI_WHITE = "\u001B[37m";
	public final String ANSI_YELLOW = "\u001B[33m";
	public final String ANSI_GREEN = "\u001B[32m";
	
	public Conductor(Auto auto, Moto moto, boolean tieneRegistro) {
		this.auto = auto;
		this.moto = moto;
		this.tieneRegistro = tieneRegistro;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public boolean isTieneRegistro() {
		return tieneRegistro;
	}

	public void setTieneRegistro(boolean tieneRegistro) {
		this.tieneRegistro = tieneRegistro;
	}

	@Override
	public String toString() {
		return "Conductor [auto=" + auto + ", moto=" + moto + ", tieneRegistro=" + tieneRegistro + "]";
	}
	
	public void esSegiro() {
		if (auto != null) esAuto();
		else esMoto();
	}
	
	private void esAuto() {
		String siNo = (tieneRegistro) ? "SI" : "NO";
		System.out.println("------- Datos del conductor -------");
		if(tieneRegistro && auto.esSeguro()) {
			System.out.println(ANSI_GREEN + "Tiene registro? " + siNo);
			System.out.println("Velocidad final de auto es de: " + auto.getVelocidad());
			System.out.println("El conductor es seguro." + ANSI_WHITE);
		} else {
			System.out.println(ANSI_YELLOW + "Tiene registro? " + siNo);
			System.out.println("Velocidad final de auto es de: " + auto.getVelocidad());
			System.out.println("El conductor NO es seguro." + ANSI_WHITE);
		}
		System.out.println("-----------------------------------");
	}
	
	private void esMoto() {
		String siNo = (tieneRegistro) ? "SI" : "NO";
		System.out.println("------- Datos del conductor -------");
		if(tieneRegistro && moto.esSeguro()) {
			System.out.println(ANSI_GREEN + "Tiene registro? " + siNo);
			System.out.println("Velocidad final de moto es de: " + moto.getVelocidad());
			System.out.println("El conductor es seguro" + ANSI_WHITE);
		} else {
			System.out.println(ANSI_YELLOW + "Tiene registro? " + siNo);
			System.out.println("Velocidad final de moto es de: " + moto.getVelocidad());
			System.out.println("El conductor NO es seguro." + ANSI_WHITE);
		}
		System.out.println("-----------------------------------");
	}
	
	
}

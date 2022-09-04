package clases;

public abstract class Vehiculo {

	protected int velocidad;

	public Vehiculo(int velocidad) {
		this.velocidad = velocidad;	
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Boolean esSeguro() {
		return false;
	}
	
	
}

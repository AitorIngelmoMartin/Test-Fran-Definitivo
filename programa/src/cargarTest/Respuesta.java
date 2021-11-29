package cargarTest;

public class Respuesta {

	String descripcion;
	boolean correcta;

	
	
	public Respuesta(String descripcion, boolean correcta) {
		super();
		this.descripcion = descripcion;
		this.correcta = correcta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}

}

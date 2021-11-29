package cargarTest;

import java.util.ArrayList;

public class Pregunta {

	String descripcion;
	String explicacion;
	ArrayList<Respuesta> respuestas;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExplicacion() {
		return explicacion;
	}

	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

}

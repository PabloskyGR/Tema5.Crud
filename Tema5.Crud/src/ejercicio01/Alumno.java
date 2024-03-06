package ejercicio01;

public class Alumno {
 
	private String nombre = "";
	private double notaMedia = 0;

	public Alumno() {

	}

	public Alumno(String nombre, double notaMedia) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if(notaMedia > 0) {
			this.notaMedia = notaMedia;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		if(notaMedia > 0) {
			this.notaMedia = notaMedia;
		}
	}
	
	public String toString() {
		String cadena = "";
		
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Nota Media: " + this.notaMedia + "\n";
	
		return cadena;
	}

}

package ejercicio03;

public class Pizza {

	private int codigo;
	private String tamaño = "";
	private String tipo = "";
	private String estado = "Pedida";

	public Pizza() {
	}

	public Pizza(int codigo, String tamaño, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (tamaño != null && !tamaño.equals("")) {
			this.tamaño = tamaño;
		}
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += "Código: " + this.codigo + "\n";
		cadena += "Tamaño: " + this.tamaño + "\n";
		cadena += "Tipo: " + this.tipo + "\n";
		cadena += "Estado: " + this.estado + "\n";

		return cadena;
	}

}

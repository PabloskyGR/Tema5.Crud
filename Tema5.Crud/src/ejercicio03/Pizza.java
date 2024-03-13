package ejercicio03;

public class Pizza {

	private int codigo;
	private String tamanyo = "";
	private String tipo = "";
	private String estado = "";

	public Pizza() {
	}

	public Pizza(int codigo, String tamanyo, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (tamanyo != null && !tamanyo.equals("")) {
			this.tamanyo = tamanyo;
		}
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}

	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		if (tamanyo != null && !tamanyo.equals("")) {
			this.tamanyo = tamanyo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado != null && !estado.equals("")) {
			this.estado = estado;
		}
	}

	public String toString() {
		String cadena = "";

		cadena += "Código: " + this.codigo + "\n";
		cadena += "Tamaño: " + this.tamanyo + "\n";
		cadena += "Tipo: " + this.tipo + "\n";
		cadena += "Estado: " + this.estado + "\n";

		return cadena;
	}

}

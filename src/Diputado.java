
public class Diputado extends Legislador{

	//EN CASO DE TENER OTROS ATRIBUTOS APARTE, CUANDO ES UN EXTEND DE UNA CLASE ABSTRACTA LOS ATRIBUTOS SON PROTECTED
	//ej:
	//protected in numero;
	
	public Diputado() {
		super();

	}
	public Diputado(String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta,
			String partidoPolitico, int numeroDespacho) {
		super(nombre, apellido, edad, casado, provinciaQueRepresenta, partidoPolitico, numeroDespacho);

	}

	public Diputado(String nombre, String apellido, int edad, boolean casado) {
		super(nombre, apellido, edad, casado);
		
	}
	public String getCamaraEnQueTrabaja() {
		return "Diputado";
	}

	public String toString() {
		return "Diputado [getProvinciaQuerepresenta()=" + getProvinciaQuerepresenta() + ", getPartidoPolitico()="
				+ getPartidoPolitico() + ", getNumeroDespacho()=" + getNumeroDespacho() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado() + "]";
	}


	

	
}

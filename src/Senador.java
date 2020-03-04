
public class Senador extends Legislador{

	//EN CASO DE TENER OTROS ATRIBUTOS APARTE, CUANDO ES UN EXTEND DE UNA CLASE ABSTRACTA LOS ATRIBUTOS SON PROTECTED
	//ej:
	//protected in numero;
	
	public Senador() {
		super();
	}
	public Senador(String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta,
			String partidoPolitico, int numeroDespacho) {
		super(nombre, apellido, edad, casado, provinciaQueRepresenta, partidoPolitico, numeroDespacho);
		
	}
	public Senador(String nombre, String apellido, int edad, boolean casado) {
		super(nombre, apellido, edad, casado);
		
	}
	public String getCamaraEnQueTrabaja() {
		return "Senador";
	}

	public String toString() {
		return "Senador [getProvinciaQuerepresenta()=" + getProvinciaQuerepresenta() + ", getPartidoPolitico()="
				+ getPartidoPolitico() + ", getNumeroDespacho()=" + getNumeroDespacho() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado() + "]";
	}
	
}

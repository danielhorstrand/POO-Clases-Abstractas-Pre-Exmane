
public abstract class Legislador extends Persona{

	String provinciaQuerepresenta;
	String partidoPolitico;
	int numeroDespacho;
	
	public Legislador() {
		super();
		this.provinciaQuerepresenta = "";
		this.partidoPolitico = "";
		this.numeroDespacho = 0;
	}
	public Legislador(String nombre, String apellido, int edad, boolean casado) {
		super(nombre, apellido, edad, casado);
		this.provinciaQuerepresenta = "";
		this.partidoPolitico = "";
		this.numeroDespacho = 0;
	}
	public Legislador(String nombre, String apellido, int edad, boolean casado, String provinciaQueRepresenta,
			String partidoPolitico, int numeroDespacho) {
		super(nombre, apellido, edad, casado);
		this.provinciaQuerepresenta = provinciaQueRepresenta;
		this.partidoPolitico = partidoPolitico;
		this.numeroDespacho = numeroDespacho;
	}
	
	public String getProvinciaQuerepresenta() {
		return provinciaQuerepresenta;
	}
	public void setProvinciaQuerepresenta(String provinciaQuerepresenta) {
		this.provinciaQuerepresenta = provinciaQuerepresenta;
	}
	public String getPartidoPolitico() {
		return partidoPolitico;
	}
	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}
	public int getNumeroDespacho() {
		return numeroDespacho;
	}
	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}

	public String toString() {
		return "Legislador [provinciaQuerepresenta=" + provinciaQuerepresenta + ", partidoPolitico=" + partidoPolitico
				+ ", numeroDespacho=" + numeroDespacho + ", toString()=" + super.toString() + "]";
	}
	public abstract String getCamaraEnQueTrabaja();
	
}

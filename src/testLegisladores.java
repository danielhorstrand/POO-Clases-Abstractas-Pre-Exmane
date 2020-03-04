import java.util.ArrayList;

public class testLegisladores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Legislador> lista = new ArrayList<Legislador>();
		

		// Por la abstracción y polimorfismo, podría hacer esto también
		Legislador diputado2 = new Diputado("Iñigo", "Errejón", 42, false, "Madrid","Más País", 300);
		lista.add(diputado2);
		Legislador diputado3 = new Diputado("Pablo", "Iglesias", 36, true, "Madrid","Unidas Podemos", 250);
		lista.add(diputado3);
		
		
		for(Legislador legislador: lista){
			System.out.println(legislador.getNombre() + " " + legislador.getApellido() + " " + legislador.getCamaraEnQueTrabaja());
		}
	}

}

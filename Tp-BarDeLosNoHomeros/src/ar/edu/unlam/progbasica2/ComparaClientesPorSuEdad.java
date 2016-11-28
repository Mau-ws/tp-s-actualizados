package ar.edu.unlam.progbasica2;

import java.util.*;

public class ComparaClientesPorSuEdad implements Comparator<Clientes> {

	
	@Override
	public int compare(Clientes nombre, Clientes edad) {
		Integer cliente1=nombre.getEdad();
		Integer cli2=edad.getEdad();
		return cliente1.compareTo(cli2);
	}
}

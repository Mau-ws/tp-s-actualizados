package ar.edu.unlam.Progbasica2;



public class Tragamonedas {
	
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	


	
	public Tragamonedas(Integer cantDeNumerosDelTambor) {
		
		tambor1 = new Tambor(cantDeNumerosDelTambor);
		tambor2 = new Tambor(cantDeNumerosDelTambor);
		tambor3 = new Tambor(cantDeNumerosDelTambor);
		
	}
	/*  activa el Tragamonedas haciendo girar
	* sus 3 Tambores.
	*/
	public void activar() {
		
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}
	
	
	/* indica si el Tragamonedas entrega un premio
	* a partir de la posición de sus 3 Tambores.
	*/
	public Boolean entregaPremio() {
		
		if (tambor1.getPosicion()==tambor2.getPosicion() && tambor1.getPosicion()==tambor3.getPosicion())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public Tambor getTambor1()
	{
		return tambor1;
	}
	public Tambor getTambor2()
	{
		return tambor2;
	}
	public Tambor getTambor3()
	{
		return tambor3;
	}
	
	}



  
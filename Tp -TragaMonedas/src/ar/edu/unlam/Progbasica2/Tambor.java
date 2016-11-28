package ar.edu.unlam.Progbasica2;

public class Tambor {
	
	
private Integer posicion = 1;
private Integer cantDeNumerosDelTambor;


public Tambor(Integer cantDeNumerosDelTambor)
{
	this.cantDeNumerosDelTambor=cantDeNumerosDelTambor;
}

public Tambor()
{
	
}


public void girar() {
	
	this.posicion = (int)(Math.random()*cantDeNumerosDelTambor+1);
	
}

public Integer getPosicion(){
	return this.posicion;
	
}

}



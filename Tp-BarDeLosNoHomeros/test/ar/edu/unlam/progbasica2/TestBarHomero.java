package ar.edu.unlam.progbasica2;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.progbasica2.BarHomero;
import ar.edu.unlam.progbasica2.Clientes;


import static org.junit.Assert.*;
import java.util.TreeSet; 

public class TestBarHomero {

       @Test
       public void BarAbiertoSinClientes(){
    	   
    	   BarHomero barSinClientes=new BarHomero();
    	   
    	   
    	   assertEquals(0,barSinClientes.listaDeClientes.size(),0.01);
    	   
       }
       
     
     @Test
    public void  BarConClientesOrdenadosPorNombre(){
    	 
    	 BarHomero bar=new BarHomero();
 		
    	 bar.agregarClientes(new Clientes("Carolina",22));
 		
    	 bar.agregarClientes(new Clientes("Josefina ",30));
 		
    	 bar.agregarClientes(new Clientes("Walter",17));
 		
    	 bar.agregarClientes(new Clientes("Pedro ",19));
 		
    	 bar.agregarClientes(new Clientes("Karen Rivero",18));
 		
    	 bar.agregarClientes(new Clientes("Walter",40));
 		
    	 bar.agregarClientes(new Clientes("Roberto ",55));
 		
    	 bar.agregarClientes(new Clientes("Pedro ",36));
 		
 		
    	 String primerCliente="Carolina";
    	 String ultimoCliente="Walter";
    	 
 		
    	 assertEquals(primerCliente,bar.DevolverPrimerCliente().getNombre());
    	 
    	 assertEquals(ultimoCliente,bar.DevolverUltimoCliente().getNombre());
 		
 			Integer ClientesDentroDelBar=6;
 		
 				assertEquals(ClientesDentroDelBar,bar.listaDeClientes.size(),0.01);
    	  }
     
     
     
    
     @Test
     public void BarConClientesOrdenadosPorEdad(){
   	
   	  BarHomero Bar=new BarHomero();
  
   	   Bar.agregarClientes(new Clientes("Visenta Garcia ",30));
   	   
   	   Bar.agregarClientes(new  Clientes("David Almada ",50));  
   	   
  	   Bar.agregarClientes(new Clientes("Ariel Latorre ",25));
  	   
   	   Bar.agregarClientes(new Clientes("Nicol Soplan ",19));
   	   
   	   Bar.agregarClientes(new Clientes("Steve Rogers ",25));
   	   
   	   Bar.agregarClientes(new Clientes("Santiago Pereira ",60));
   	   
       Bar.agregarClientes(new Clientes("Camila Gregorio ",22));
    	
    	
   	 	
   	 	Integer cantidadEsperada=6;
   	 	Integer cantidadDeClientes=Bar.comparandoLosClientesPorEdad().size();
	
   	 	assertEquals(cantidadEsperada,cantidadDeClientes);	

   	 	
    	String  primerCliente="Nicol Soplan ";
   	 	String ultimoCliente="Santiago Pereira ";
   	 	
   	
      	
    	assertEquals(primerCliente,Bar.DevolverPrimerClientPorEdad());
    	assertEquals(ultimoCliente,Bar.DevolverUltimoClientePorEdad());
    	
      	 
  
    
     }
      
      @Test 
      public void comparandoClientesAdentroYAfueraDelBar(){
    	  
    	  BarHomero Clientes=new BarHomero();
    	  
    	  Clientes.agregarClientes(new Clientes("walter",53));
    	  
    	  Clientes.agregarClientes(new Clientes("arjona ",31));
    	  
    	  Clientes.agregarClientes(new Clientes("florencia",60));
    	  
    	  Clientes.agregarClientes(new Clientes("estefania",48));
    	  
    	  Clientes.agregarClientes(new Clientes("Roberto Melconian",48));
    	  
    	 
    	  Clientes cliente=new Clientes("walter",31);
    	 

            //comparo el nombre de un cliente de afuera con uno dentro del bar 
    	  
   		  assertTrue( Clientes.ComparandoClientesAdentroYAfuera(Clientes, cliente)==true);               
    	  
   		 }	                
      }
package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ejercito.Armamento;
import ejercito.Ni�o;



public class Ni�oTest {
	
	private Ni�o jesus;
	private Armamento arma;
	
	@Before
	public void reclutarNi�o() {
		jesus = new Ni�o();
		arma = new Armamento(50);
	}
	
	@Test
	public void cargaBien() {
						
		Assert.assertEquals(true, jesus.armarse(arma));
	}
	
	@Test
	public void cargaDosVeces(){
					
		jesus.armarse(arma);

		Assert.assertEquals(true, jesus.armarse(new Armamento(70)));
	}
	
	@Test
	public void cargaTresVeces() {
		
		jesus.armarse(arma);
		jesus.armarse(arma);
		
		Assert.assertEquals(false, jesus.armarse(arma));
	}
	
	@Test
	public void pesoDeMas() {
		Assert.assertEquals(false, jesus.armarse(new Armamento(150)));
	}
	
	@Test
	public void excesoDePesoSegundaArma() {
		jesus.armarse(arma);
		
		Assert.assertEquals(false, jesus.armarse(new Armamento(75)));
	}
	

}

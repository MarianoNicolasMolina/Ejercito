package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ejercito.Armamento;
import ejercito.Niño;



public class NiñoTest {
	
	private Niño jesus;
	
	@Before
	public void reclutarNiño() {
		jesus = new Niño();
	}
	
	@Test
	public void cargaBien() {
						
		Assert.assertEquals(true, jesus.armarse(new Armamento(50,150)) );
	}
	
	@Test
	public void cargaDosVeces(){
					
		jesus.armarse(new Armamento(50,300));

		Assert.assertEquals(true, jesus.armarse(new Armamento(70,300)));
	}
	
	@Test
	public void cargaTresVeces() {
		
		jesus.armarse(new Armamento(50,400));
		jesus.armarse(new Armamento(50,400));
		
		Assert.assertEquals(false, jesus.armarse(new Armamento(50,400)));
	}
	
	@Test
	public void pesoDeMas() {
		Assert.assertEquals(false, jesus.armarse(new Armamento(150,400)));
	}
	
	@Test
	public void excesoDePesoSegundaArma() {
		jesus.armarse(new Armamento(50,400));
		
		Assert.assertEquals(false, jesus.armarse(new Armamento(75,400)));
	}
	

}

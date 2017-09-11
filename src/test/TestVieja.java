package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ejercito.Armamento;
import ejercito.Vieja;

public class TestVieja {
	
	private Vieja irma ;
	
	@Before
	public void reclutarVieja() {
		irma = new Vieja();
	}
	
	@Test
	public void cargarVieja() {
		
		Assert.assertEquals(true, irma.armarse(new Armamento(50,600,400)));
	}
	
	@Test
	public void cargarVolumenDeMas(){
		
		Assert.assertEquals(false, irma.armarse(new Armamento(50,1200,500)));
		
	}
	
	@Test
	public void tresCargas() {
		
		boolean resul = irma.armarse(new Armamento(50,200,200));
		boolean resul2 = irma.armarse(new Armamento(50,400,500));
		boolean resul3 = irma.armarse(new Armamento(50,200,350));
		
		Assert.assertEquals(true, resul && resul2 && resul3);
		
	}
	
	@Test
	public void distanciaErronea() {
		Assert.assertEquals(false, irma.armarse(new Armamento()));
	}
	
	
}

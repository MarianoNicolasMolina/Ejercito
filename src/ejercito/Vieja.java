package ejercito;

public class Vieja extends Unidad{
	
	private static final double DIST_MAX=700;
	
	public Vieja(){
		this.volMax=1000;
	}
	

	@Override
	public void cargo(Armamento armamento) {
		
		this.volMax-=armamento.getVolumen();
		
	}


	@Override
	public boolean puedoCargar(Armamento armamento) {
		return this.volMax >=armamento.getVolumen() && DIST_MAX >= armamento.getDistancia();
		
	}
	
}

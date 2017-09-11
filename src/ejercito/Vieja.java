package ejercito;

public class Vieja extends Unidad{
	
	public Vieja(){
		this.volMax=1000;
		this.distMax=700;
	}
	



	@Override
	public void cargo(Armamento armamento) {
		
		this.volMax-=armamento.getVolumen();
		
	}


	@Override
	public boolean puedoCargar(Armamento armamento) {
		return this.volMax >=armamento.getVolumen() && this.distMax >= armamento.getDistancia();
		
	}
	
}

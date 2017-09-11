package ejercito;

public class Avioneta extends Unidad {
	
	private final static double DIST_MAX=1700;
	private final static double DIST_MIN=500;
	
	public Avioneta() {
		this.pesoMax=1000;
		this.volMax=500000;
	}

	@Override
	public boolean puedoCargar(Armamento armamento) {
		return pesoMax>=armamento.getPeso() && 
				volMax>=armamento.getVolumen() &&
				armamento.getDistancia() <= DIST_MAX &&
				armamento.getDistancia() >= DIST_MIN;
	}

	@Override
	public void cargo(Armamento armamento) {
		pesoMax -= armamento.getPeso();
		volMax -= armamento.getVolumen();		
	}

}

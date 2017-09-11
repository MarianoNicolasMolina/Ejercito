
package ejercito;

public class Ni�o  extends Unidad{
	
	public Ni�o(){
		this.cantArmas=2;
		this.pesoMax=120;
	}
	

	@Override
	public boolean puedoCargar(Armamento armamento) {
		return this.cantArmas !=0 && this.pesoMax >= armamento.getPeso();
	}

	@Override
	public void cargo(Armamento armamento) {
		this.cantArmas--;
		this.pesoMax-=armamento.getPeso();
		
	}

	
}

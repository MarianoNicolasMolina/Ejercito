package ejercito;

public abstract class Unidad{
	protected double pesoMax;
	protected double volMax;
	protected int cantArmas;
	
	public boolean armarse(Armamento armamento) {
		if(puedoCargar(armamento))
		{
			cargo(armamento);
			return true;
		}
		
		return false;
	}
	public abstract boolean puedoCargar(Armamento armamento);
	public abstract void cargo(Armamento armamento);
	
}

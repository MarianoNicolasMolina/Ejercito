package ejercito;

public class Armamento{
	private double peso;
	private double volumen;
	private double distanciaObejtivo;
	
	public Armamento(double peso) {
		this.peso = peso;
	}
	
	public Armamento(double peso, double volumen) {
		this.peso = peso;
		this.volumen = volumen;
	}
	
	public Armamento(double peso, double volumen, double distancia) {
		this.peso = peso;
		this.volumen = volumen;
		this.distanciaObejtivo = distancia;
	}
	
	public Armamento() {
		this(60,300,400);
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	public double getVolumen(){
		return this.volumen;
	}
	
	public double getDistancia() {
		return this.distanciaObejtivo;
	}
}

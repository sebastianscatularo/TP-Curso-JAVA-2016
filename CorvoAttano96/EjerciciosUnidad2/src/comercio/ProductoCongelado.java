package comercio;

//Creado por Favio Veron

public class ProductoCongelado extends Producto {
private float temperaturaCongelacion;
	
	//Constructores
	public ProductoCongelado(){	
	}
	
	public ProductoCongelado(String fechaCaducidad,int numeroLote,float temperatura){
		super(fechaCaducidad,numeroLote);
		temperaturaCongelacion=temperatura;
	}
	
	//Getter and setter
	public float getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(float temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}
	
	@Override
	public String toString(){
		return (super.toString()+"\nTemperatura de congelacion recomendada: "+temperaturaCongelacion+" °C");
		
	}
	
	
	

}

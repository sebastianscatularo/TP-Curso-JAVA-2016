package comercio;


//Creado por Favio Veron

public abstract class Producto {
	private String fechaCaducidad;
	private int numeroLote;
	
	//Constructores
	public Producto(){
	}
	
	public Producto(String fechaCaducidad,int numeroLote){
		this.fechaCaducidad=fechaCaducidad;
		this.numeroLote=numeroLote;
	}
	
	//Getters and Setters
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	
	@Override
	public String toString(){
		return ("Fecha de caducidad: "+fechaCaducidad+"\nNumero de lote: "+numeroLote);
	}
	

}

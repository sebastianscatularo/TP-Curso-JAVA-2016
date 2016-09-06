package comercio;

//Creado por Favio Veron

public class ProductoFresco extends Producto {
	public String fechaEnvasado;
	public String paisOrigen;
	
	//Constructores
	public ProductoFresco(){
	}
	
	public ProductoFresco(String fechaCaducidad,int numeroLote,String fechaEnvasado,String paisOrigen){
		super(fechaCaducidad,numeroLote);
		this.fechaEnvasado=fechaEnvasado;
		this.paisOrigen=paisOrigen;
	}

	//Getters and setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	//toString
	public String toString(){
		return (super.toString()+"\nFecha de envasado: "+fechaEnvasado+"\nPais de origen: "+paisOrigen);
	}
	
	
	
	
	
}

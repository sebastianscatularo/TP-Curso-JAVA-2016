package comercio;

//Creado por Favio Veron

public class ProductoRefrigerado extends Producto {
	private String codOrgSupAlimentaria;
	
	//Constructores
	public ProductoRefrigerado(){	
	}
	
	public ProductoRefrigerado(String fechaCaducidad,int numeroLote,String codigo){
		super(fechaCaducidad,numeroLote);
		codOrgSupAlimentaria=codigo;
	}
	
	//Getter and Setter
	public String getCodOrgSupAlimentaria() {
		return codOrgSupAlimentaria;
	}

	public void setCodOrgSupAlimentaria(String codOrgSupAlimentaria) {
		this.codOrgSupAlimentaria = codOrgSupAlimentaria;
	}
	
	//ToString
	@Override
	public String toString(){
		
		return (super.toString()+"\nCodigo del Organismo de supervisión alimentaria: "+codOrgSupAlimentaria);
	}
	
	
	

}

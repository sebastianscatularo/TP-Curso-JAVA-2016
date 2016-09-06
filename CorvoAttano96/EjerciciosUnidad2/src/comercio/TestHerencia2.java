package comercio;

public class TestHerencia2 {
	public static void main(String[] args){
		Producto p1=new ProductoFresco("20/09/2016",130001,"30/08/2016","Argentina");
		Producto p2=new ProductoRefrigerado("30/11/2016",130021,"0A4321");
		Producto p3=new ProductoCongelado("30/01/2016",130030,(float)(-18.0));
		
		/*ProductoFresco pp1=(ProductoFresco)p1;
		ProductoRefrigerado pp2=(ProductoRefrigerado)p2;
		ProductoCongelado pp3=(ProductoCongelado)p3;*/
		
		
		System.out.println("Datos del producto fresco \n\n"+p1.toString());
		
		System.out.println("\n\nDatos del producto refrigerado \n\n"+p2.toString());
		
		System.out.println("\n\nDatos del primer congelado \n\n"+p3.toString());

		
	}

}

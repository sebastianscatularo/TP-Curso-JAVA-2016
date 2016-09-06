package Ejercicio2;


public class ProductoRefrigerado extends Producto {

    private int codigoSupervicion;

    public int getCodigoSupervicion() {
        return codigoSupervicion;
    }

    public void setCodigoSupervicion(int codigoSupervicion) {
        this.codigoSupervicion = codigoSupervicion;
    }


    public ProductoRefrigerado(String fecha, int lote, int codigo){
        super(lote,fecha);
        this.codigoSupervicion = codigo;
    }

    public String toString() {
        return
                "Producto Refrigerado" + "\n" +
                "Fecha Caducidad: "+super.getFecha()+ "\n" +
                "Lote: "+super.getLote()+ "\n" +
                "Codigo de supervición: "+ getCodigoSupervicion() + "\n";
    }
}

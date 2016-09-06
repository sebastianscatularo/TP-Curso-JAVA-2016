package Ejercicio2;


public class ProductoFresco extends Producto {

    private String fechaEnvasado;
    private String paisOrigen;

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public ProductoFresco(String fecha, int lote, String fechaEnvasado, String origen ){
        super(lote,fecha);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = origen;
    }

    public String toString(){
        return
            "Producto Fresco"+ "\n" +
            "Fecha Caducidad: "+super.getFecha()+ "\n" +
            "Lote: "+super.getLote()+ "\n" +
            "Fecha de envasado: "+ getFechaEnvasado() + "\n"+
            "Origen: "+getPaisOrigen() + "\n";

    }


}

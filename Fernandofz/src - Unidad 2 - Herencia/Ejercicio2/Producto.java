package Ejercicio2;


public abstract class Producto {

    private String fecha;
    private int lote;


    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    public Producto(int lote, String fecha) {
        this.lote = lote;
        this.fecha = fecha;
    }

    public abstract String toString();

}

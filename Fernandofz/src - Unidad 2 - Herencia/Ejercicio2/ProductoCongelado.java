package Ejercicio2;


import java.text.DecimalFormat;

public class ProductoCongelado extends Producto {

    private float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public ProductoCongelado(String fecha, int lote, float temp) {
        super(lote,fecha);
        this.temperatura = temp;
    }

    public String toString() {
        return
                "Producto Congelado" + "\n" +
                        "Fecha Caducidad: "+super.getFecha()+ "\n" +
                        "Lote: "+super.getLote()+ "\n" +
                        "Temperatura: "+ String.format("%.01f",getTemperatura()) + "ºC\n";
    }




}

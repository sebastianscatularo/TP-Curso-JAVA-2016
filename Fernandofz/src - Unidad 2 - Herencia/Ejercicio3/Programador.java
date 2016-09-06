package Ejercicio3;


public class Programador extends Empleado {

    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }


    public Programador() {
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
    }

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }


    public String toString() {
        return super.toString() +
               "Programador" + "\n" +
                "Lineas de codigo por hora: " + this.lineasDeCodigoPorHora + "\n" +
                "Lenguaje Destacado: " + this.lenguajeDominante + "\n";
    }


}

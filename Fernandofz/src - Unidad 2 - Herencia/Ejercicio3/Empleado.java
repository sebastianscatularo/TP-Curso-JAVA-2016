package Ejercicio3;


public class Empleado {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {
        this.nombre = " ";
        this.cedula = " ";
        this.edad = 0;
        this.casado = false;
        this.salario = 0;
    }

    public Empleado(String nombre, String cedula, int edad,boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String getClasificacion(){
        if (this.edad <= 21){
            return "Principiante";
        } else if (this.edad >=22 && this.edad <=35){
            return "Intermedio";
        } else return "Senior.-";
    }

    public void setPayRaise(int porcentaje){
        this.salario = this.salario*(1+((double)porcentaje)/100);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String toString() {
        return "Empleado" + "\n" +
                "nombre: " + nombre  + "\n" +
                "cedula: " + cedula  + "\n" +
                "edad: " + edad + "\n" +
                "casado: " + casado + "\n" +
                "salario: " + salario + "\n";
    }
}

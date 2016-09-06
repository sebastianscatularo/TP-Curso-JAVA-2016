package Ejercicio3;


public class Empresa {

    public static void main(String ... args){

        Empleado persona1 = new Empleado("Juan perez","b814",28,false,5000);
        System.out.println(persona1);
        persona1.setPayRaise(7);
        System.out.println(persona1);
        System.out.println(persona1.getClasificacion());
        System.out.println();
        Programador persona2 = new Programador("Marco Polo","A641",30,false,6000,200,"PeAchePe");
        System.out.println(persona2);

    }


}

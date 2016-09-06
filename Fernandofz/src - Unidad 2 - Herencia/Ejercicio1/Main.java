package Ejercicio1;


public class Main {
    public static void main(String [] args){

        float[] arreglo = new float[20];

        for (int i=0;i<20;i++){
            arreglo[i]=(float)(Math.random()*100);
            System.out.print(arreglo[i]+",");
        }
        System.out.println();
        System.out.println("Maximo: " + Math2.max(arreglo));
        System.out.println("Minimo: " + Math2.min(arreglo));
        System.out.println("Media Aritmetica: " + Math2.medArit(arreglo));
        System.out.println("Media Geometrica: " + Math2.medGeo(arreglo));
    }
}

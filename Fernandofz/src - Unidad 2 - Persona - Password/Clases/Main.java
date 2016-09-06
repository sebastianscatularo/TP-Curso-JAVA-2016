package Clases;

import java.util.Scanner;


public class Main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Nombre, edad, genero, peso y altura de la persona:");
        String name = sc.next();
        int age=sc.nextInt();
        char gender =sc.next().charAt(0);
        float weight = sc.nextFloat();
        float height = sc.nextFloat();



        Persona P1 = new Persona(name,age,gender,weight,height);
        Persona P2 = new Persona(name,age,gender);
        Persona P3 = new Persona();
        P3.setName("Mariano");
        P3.setAge(23);
        P3.setGender('H');
        P3.setHeight((float)1.82);
        P3.setWeight(103);



        System.out.println(P1.toString());
        if (P1.calculateIMC()<0){
            System.out.println("Persona 1: Esta desnutrido");
        } else if (P1.calculateIMC()==0){
            System.out.println("Persona 1: Esta con peso ideal");
        } else {
            System.out.println("Persona 1: Esta con sobrepeso");
        }

        if (P2.calculateIMC()<0){
            System.out.println("Persona 2: Esta desnutrido");
        } else if (P2.calculateIMC()==0){
            System.out.println("Persona 2: Esta con peso ideal");
        } else {
            System.out.println("Persona 2: Esta con sobrepeso");
        }

        if (P3.calculateIMC()<0){
            System.out.println("Persona 3: Esta desnutrido");
        } else if (P3.calculateIMC()==0){
            System.out.println("Persona 3: Esta con peso ideal");
        } else {
            System.out.println("Persona 3: Esta con sobrepeso");
        }

        System.out.println();

        if (P1.isAdult()){
            System.out.println("Persona 1: Es adulto");
        }
        else{
            System.out.println("Persona 1: No Es adulto");
        }
        if (P2.isAdult()){
            System.out.println("Persona 2: Es adulto");
        }
        else{
            System.out.println("Persona 2: No Es adulto");
        }
        if (P3.isAdult()){
            System.out.println("Persona 3: Es adulto");
        }
        else{
            System.out.println("Persona 3: No Es adulto");
        }

        System.out.println();
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        System.out.println(P3.toString());
        System.out.println("");
        System.out.println("Ingrese la cantidad de Passwords que desea generar: ");
        int cant=sc.nextInt();
        System.out.println("Ingrese la longitud de cada Password: ");
        int longitud = sc.nextInt();
        Password[] Pass=new Password[cant];
        for (int i=0;i<cant;i++){
            Pass[i]= new Password(longitud);
        }

        boolean strongs[] = new boolean[cant];
        for (int i=0;i<cant;i++){
            strongs[i] = Pass[i].isStrong();
            System.out.println("Contraseña " + (i+1) + ": " + Pass[i].toString() + " Strong: " + (strongs[i] ? "Yes": "No"));
        }



    }

}

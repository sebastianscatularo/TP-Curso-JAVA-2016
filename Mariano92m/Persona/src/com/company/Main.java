package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String n;
        int a;
        char g;
        float w;
        float h;

        System.out.println("Ingrese:");
        System.out.print("Nombre:");
        n=sc.next();
        System.out.print("Edad:");
        a=sc.nextInt();
        System.out.print("Genero:");
        g=sc.next().charAt(0);
        System.out.print("Peso:");
        w=sc.nextFloat();
        System.out.print("Altura:");
        h=sc.nextFloat();



        Persona p1= new Persona(n,a,g,w,h);
        Persona p2= new Persona(n,a,g);
        Persona p3= new Persona();

        p3.setName("Fer");
        p3.setAge(25);
        p3.setGender('H');
        p3.setWeight(71);
        p3.setHeight((float)1.85);

        pesoIdeal((int)p1.calcularIMC());
        pesoIdeal((int)p2.calcularIMC());
        pesoIdeal((int)p3.calcularIMC());

        isMayor(p1.isAdult());
        isMayor(p2.isAdult());
        isMayor(p3.isAdult());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

    static void pesoIdeal(int pesoI){
        if(pesoI<0){
            System.out.println("Se encuentra debajo del peso ideal");
        }else if(pesoI==0){
            System.out.println("Posee el peso ideal");
        }else{
            System.out.println("Posee sobrepeso");
        }
    }
    static void isMayor(boolean isAd){
        if(isAd==true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Password p[];
        boolean ps[];

        System.out.println("Ingrese la cantidad de contraseñas");
        int cantP=sc.nextInt();
        p=new Password[cantP];
        ps=new boolean[cantP];

        System.out.println("Ingrese el largo de la contraseñas");
        int larP=sc.nextInt();

        for(int i=0; i<cantP; i++){
            p[i]= new Password(larP);
            p[i].generatePass();
            ps[i]= p[i].isStrong();
            System.out.print(p[i].toString() + " " +ps[i]+ "\n");
        }
    }
}

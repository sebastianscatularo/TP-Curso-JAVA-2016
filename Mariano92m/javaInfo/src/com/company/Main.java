package com.company;

public class Main {

    public static void main(String[] args) {
        testRandom();
        arreglito();
    }

    static void testRandom(){
        int randum,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        int i=0;

        while(i<100){
            randum=1+(int)(Math.random()*10);
            switch(randum){
                case 1:
                    cont1+=1;
                    break;
                case 2:
                    cont2+=1;
                    break;
                case 3:
                    cont3+=1;
                    break;
                case 4:
                    cont4+=1;
                    break;
                case 5:
                    cont5+=1;
                    break;
            }
            i++;
        }
        System.out.println("Se muestran " + cont1 + " el numero 1");
        System.out.println("Se muestran " + cont2 + " el numero 2");
        System.out.println("Se muestran " + cont3 + " el numero 3");
        System.out.println("Se muestran " + cont4 + " el numero 4");
        System.out.println("Se muestran " + cont5 + " el numero 5");
    }
    static void arreglito(){
        int a[]= new int [1000];

        int cont=0;
        int sum=0;

        for(int i=0;i<a.length;i++){
            a[i]=1+(int)(Math.random()*20);;
        }
        for(int d:a){
            if(a[d]%2==0){
                sum+=a[d];
                cont+=1;
            }
        }
        System.out.println("Hay " + cont + " numeros pares");
        System.out.println("La suma de los pares en el arreglo es " + sum);
    }
}

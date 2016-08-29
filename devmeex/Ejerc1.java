/**
 * Created by crist on 28/08/2016.
 */
public class Ejerc1 {


    public static void random1() {
        int i = 1; int num; int num1; int num2; int num3;int num4; int num5;
        num1 =0;num2 = 0; num3=0; num4=0;num5=0;
        while(i <=10){
            num= 1 + (int)(Math.random()*5);

            //System.out.println(num);

            switch(num){
                case 1: num1++;
                case 2: num2++;
                case 3: num3++;
                case 4: num4++;
                case 5: num5++;
            }
            i++;
        }
        System.out.println("Los numeros aleatorios generados en cantidades fue: ");
        System.out.print("el 1: "+num1 +" el 2: "+num2 +" el 3: "+num3 +" el 4: "+num4 +" el 5: "+num5);
        System.out.println();
    }

    public static void random2() {
        int[] list =  new int[1000];
        int cant; int total;
        for (int i=0;i<1000;i++){
            list[i] = 1+(int)(Math.random()*20);

        }
        cant=0;total=0;
        for(int number: list){
            if (number%2 == 0){
                cant++;
                total += number;
            }
        }

        System.out.println("La Cantidad de Pares fue:" +cant);
        System.out.println("La sumatoria de Numeros pares fue:" +total);
    }


    public static void main(String[] args) {
        random1();
        random2();

    }



}



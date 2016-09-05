
import java.util.Scanner;

//Creado por Favio Veron

public class Main {
	public static void main (String[] args){
		
		ejercicioHerencia1();
		ejercicioHerencia3();
		
		
	}

	
	//Aca estan los metodos que ejecutan los ejercicios de herencia
	static void ejercicioHerencia1(){
		int longArray;
		float min,max,suma,marit,mgeo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de elementos que tendrá su arreglo: ");
		longArray=sc.nextInt();
		float[] arreglo=new float [longArray];
		
		System.out.println("Ingresa los elementos del arreglo: ");
		for (int i=0;i<arreglo.length;i++){
			System.out.println("Ingresa elemento: "+(i+1));
			arreglo[i]=sc.nextFloat();	
		}


		min=Math2.minimum(arreglo);
		max=Math2.maximum(arreglo);
		suma=Math2.summation(arreglo);
		marit=Math2.arithmeticMean(arreglo);
		mgeo=Math2.geometricMean(arreglo);
		
		
		System.out.println("Mínimo: "+min);
		System.out.println("Máximo: "+max);
		System.out.println("Sumatoria: "+suma);
		System.out.println("Media aritmetica:  "+marit);
		System.out.println("Media geométrica:  "+mgeo);
		
	}
	
	static void ejercicioHerencia3(){
		Programador e1 = new Programador("Favio","1234",12,false,4000,30,"Java");
		
		e1.imprimirDatos();
		
		System.out.println("Clasificacion: "+e1.clasificadorEdad());
		
		e1.aumentadorSalario(30);
		System.out.println("El nuevo salario es: "+e1.getSalario());
		
		System.out.println("Lineas de cod por hora: "+e1.getLineasDeCodigoPorHora());
		System.out.println("Lenguaje que domina: "+e1.getLenguajeDominante());
		
	}
}

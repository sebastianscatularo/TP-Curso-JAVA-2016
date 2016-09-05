
//Creado por Favio Veron

public final class Math2 {
	
	//Devuelve el valor maximo de un arreglo de enteros
	public static float maximum(float[] array){
		float max =array[0];
		for (int i=0;i<array.length;i++){
			if (array[i]>max){
				max=array[i];
			}
		}
		return max;
	}
	
	//Devuelve el valor minimo de un arreglo de enteros
	public static float minimum(float[] array){
		float min = array[0];
		for (int i=1;i<array.length;i++){
			if (array[i]<min){
				min=array[i];
			}
		}
		return min;
	}
	
	//Devuelve la sumatoria de los elementos de un arreglo de enteros
	public static float summation(float[] array){
		float summation=0;
		for (int i=0;i<array.length;i++){
			summation+=array[i];
		}
		
		return summation;
	}
	
	
	//Devuelve la media aritmetica de un arreglo de enteros
	public static float arithmeticMean(float[] array){
		float total=0;
		for (int i=0;i<array.length;i++){
			total+=array[i];
		}
		total/=array.length;
		
		return total;
	}

	//Devuelve la media aritmetica de un arreglo de enteros
	public static float geometricMean(float[] array){
		float total=1;
		for (int i=0;i<array.length;i++){
			total*=array[i];
		}
		total=(float)Math.pow(total, 1.0/array.length);
		
		return total;
	}

}

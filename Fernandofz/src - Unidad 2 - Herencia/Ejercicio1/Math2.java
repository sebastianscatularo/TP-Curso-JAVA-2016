package Ejercicio1;




public class Math2 {

    static float max(float[] arr){
        float max=Float.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    static float min(float[] arr){
        float min=Float.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static float sum(float[] arr){
        float sum=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static float medArit(float[] arr){
        float sum=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    static float medGeo(float[] arr){
        float mult=1;

        for (int i=0;i<arr.length;i++){
            mult*=arr[i];
        }
        return (float)Math.sqrt(mult);
    }

}

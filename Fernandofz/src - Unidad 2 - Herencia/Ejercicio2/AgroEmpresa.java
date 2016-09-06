package Ejercicio2;

public class AgroEmpresa {

    public static void main(String ... args){



        ProductoFresco pro1 = new ProductoFresco("10-02-2017",48,"16-12-2016","China");
        System.out.println(pro1);

        ProductoRefrigerado pro2 = new ProductoRefrigerado("01-05-2018",34,12412);
        System.out.println(pro2);

        ProductoCongelado pro3 = new ProductoCongelado("20-10-2020",2,(float)10.9);
        System.out.println(pro3);
    }


}

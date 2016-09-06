import java.math.MathContext;

/**
 * Created by DevMeex on 27/08/2016.
 */
import java.util.Random;
import java.util.Scanner;
public class Password {
    private int longitud = 0;
    private String contraseña = "";

    //Constructor por Defecto
    public Password(){
        longitud = 8;
    }

    //Setter de longitud
    public void setlongitud(int longitud){
        this.longitud = longitud;
    }

    //Getter de longitud
    public int getLongitud(){
        return longitud;
    }

    //Getter de contraseña
    public String getContraseña(){
        return  contraseña;
    }

    public String generatePass(){
        Random r = new Random();
        char c;
        for(int i=0;i<longitud;i++){
            c = (char)(48+r.nextInt(65));
            contraseña += c;
        }
        return contraseña;
    }
    public boolean isStrong(String b){
        String a = b;
        int dig = 0;
        int mayus = 0,min = 0;
        for (int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i)) == true){
                dig++;
            }
            if (Character.isLetter(a.charAt(i)) == true){
                if (Character.isLowerCase(a.charAt(i)) == true){
                    min++;
                }else{
                    mayus++;
                }
            }
        }
        //Evalua la condicion de pass strong
        if(mayus>2 && min >1 && dig>5){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la longitud de las Password");
        int tamaño = teclado.nextInt();

        String[] pass = new String[9];
        boolean[] valid = new boolean[9];

        for (int i=0; i<=8;i++){
            //Instacio mi objeto Password
            Password p = new Password();
            p.setlongitud(tamaño);
            pass[i] = p.generatePass();
            valid[i] = p.isStrong(pass[i]);
            System.out.println(pass[i] +" " +valid[i]);
        }

    }
}

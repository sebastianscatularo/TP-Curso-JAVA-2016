/**
 * Created by crist on 28/08/2016.
 */
import java.util.Scanner;
public class Persona {
    private int id;
    private String name = "";
    private int age = 0;
    private char gender = 'H';
    private float weight = 0;
    private float height = 0;

    //Constructor por defecto clase
    public Persona(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = generateID();
        checkGender(gender);
    }

    //Setter de name
    public void setName(String name) {
        this.name = name;
    }

    //Setter  de age
    public void setAge(int age) {
        this.age = age;
    }

    //Setter de gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    //Setter de peso
    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Setter de altura
    public void setHeight(float height) {
        this.height = height;
    }

    //getter id
    public int getId() {
        return id;
    }

    //getter name
    public String getName() {
        return name;
    }

    //getter age
    public int getAge() {
        return age;
    }

    //getter gender
    public char getGender() {
        return gender;
    }

    //getter altura
    public float getHeight() {
        return height;
    }

    //getter peso
    public float getWeight() {
        return weight;
    }

    //Devuelve toda la informacion de Persona
    public String toStrinG() {
        String info = "ID " + Integer.toString(getId()) + " NAME " + getName() + " AGE " + getAge() + " GENERO "
                + getGender() + " PESO "
                + getWeight() + " ALTURA " + getHeight();
        return info;

    }

    public int calculateIMC() {
        if (this.weight / (getHeight() * getHeight()) > getWeight()) {
            return 1;
        } else {
            if (this.weight / (getHeight() * getHeight()) < getWeight()) {
                return -1;
            } else {
                return 0;
            }

        }
    }

    //metodo comprueba mayor de edad
    public boolean isAdult() {
        if (this.getAge() > 20) {
            return true;
        } else {
            return false;
        }
    }
    //metodo para comprobar si el genero es correcto

    public void checkGender(char gender) {
        if (gender != 'M' && gender != 'M') {
            this.gender = 'H';
        }

    }

    private int generateID() {
        return 1 + (int) (Math.random() * 100000000);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float altura,peso;
        //Persona 1
        System.out.println("Ingrese un Nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese edad");
        int edad = teclado.nextInt();
        System.out.println("Ingrese sexo");
        char sexo = (teclado.next()).charAt(0);
        System.out.println("Ingrese el peso");
        peso = teclado.nextFloat();
        System.out.println("Ingrese la altura");
        altura = teclado.nextFloat();

        Persona p1 = new Persona(nombre, edad, sexo);
        p1.setHeight(altura);
        p1.setWeight(peso);
        if (p1.calculateIMC() == 0) {
            System.out.println("PESO IDEAL");

        } else {
            if (p1.calculateIMC() == 1) {
                System.out.println("SOBREPESO");
            } else {
                System.out.println("POR DEBAJO DEL PESO");
            }
        }
        if (p1.isAdult() == true) {
            System.out.println("MAYOR DE EDAD");
        } else {
            System.out.println("MENOR DE EDAD");
        }

        System.out.println(p1.toStrinG());

        //Persona 2
        System.out.println("Ingrese un Nombre");
        nombre = teclado.next();
        System.out.println("Ingrese edad");
        edad = teclado.nextInt();
        System.out.println("Ingrese sexo");
        sexo = (teclado.next()).charAt(0);

        Persona p2 = new Persona(nombre, edad, sexo);
        p2.setWeight(95.2f);
        p2.setHeight(1.90f);
        if (p2.calculateIMC() == 0) {
            System.out.println("PESO IDEAL");

        } else {
            if (p2.calculateIMC() == 1) {
                System.out.println("SOBREPESO");
            } else {
                System.out.println("POR DEBAJO DEL PESO");
            }
        }
        if (p2.isAdult() == true) {
            System.out.println("MAYOR DE EDAD");
        } else {
            System.out.println("MENOR DE EDAD");
        }

        System.out.println(p2.toStrinG());

        //Persona 3
        Persona p3 = new Persona("Marcelo", 20, 'H');
        p3.setHeight(1.75f);
        p3.setWeight(70.1f);
        if (p3.calculateIMC() == 0) {
            System.out.println("PESO IDEAL");

        } else {
            if (p3.calculateIMC() == 1) {
                System.out.println("SOBREPESO");
            } else {
                System.out.println("POR DEBAJO DEL PESO");
            }
        }

         if (p3.isAdult() == true) {
             System.out.println("MAYOR DE EDAD");
         } else {
             System.out.println("MENOR DE EDAD");
         }


         System.out.println(p3.toStrinG());

    }
}
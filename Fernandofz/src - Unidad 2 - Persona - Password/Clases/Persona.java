package Clases;




public class Persona {

    private String name="";
    private int age=0;
    private int id=0;
    private char gender=' ';
    private float weight=0;
    private float height=0;



public Persona(){
    this.name= "";
    this.age=0;
    this.id=generateId();
    this.gender=' ';
    this.weight=0;
    this.height=0;
}
    public Persona(String name, int age, char gender){
        this.name= name;
        this.age=age;
        this.id=generateId();
        this.gender=gender;
        this.weight=0;
        this.height=0;
    }

    public Persona(String name, int age, char gender, float weight, float height){
        this.name= name;
        this.age=age;
        this.id=generateId();
        this.gender=checkGender(gender);
        this.weight=weight;
        this.height=height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int calculateIMC(){
        float imc;
        imc = this.weight/(float)Math.pow(this.height,2);
        if (imc<18.5){
            return -1;
        } else if (imc<25){
                return 0;
                } else return 1;
    }

    public boolean isAdult(){
        if (this.age>17){
            return true;
        }
        else{
            return false;
        }
    }


    private char checkGender(char gender){
        gender=Character.toUpperCase(gender);
        if ((gender=='F') || (gender=='H')){
            return gender;
        }
        else {
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}' + "id: " + id;
    }

    private int generateId(){
        return (int)(Math.random()*100000000);
    }
}

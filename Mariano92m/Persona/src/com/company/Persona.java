package com.company;

/**
 * Created by usuario on 23/08/16.
 */
public class Persona {

    //Estado - Atributos
    int id;
    String name;
    int age;
    char gender;
    float weight;
    float height;

    //Constructores
    public Persona(){
        this.id=generateId();
    }
    public Persona(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.id=generateId();
    }
    public Persona(String name, int age, char gender, float weight, float height){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.weight=weight;
        this.height=height;
        this.id=generateId();
    }

    //Comportamiento - Metodos
    public float calcularIMC(){
        float p=this.weight;
        float r= (p/(float)(Math.pow(this.height,2)));
        if(r<18.25){
            r=-1;
        }else if(r<24.9){
            r=0;
        }else{
            r=1;
        }
        return (r);
    }

    public boolean isAdult(){
        return age<18?false:true;
    }
    private void checkGender(char gender){
        if(this.gender!='H'){
            System.out.println("Es mujer");
        }
        else{
            System.out.println("Es hombre");
        }
    }

    @Override
    public String toString() {
        return "Nombre:"+this.name+" Edad:"+this.age+" Genero:"+this.gender+" Peso:"+this.weight+" Altura:"+this.height+" ID:"+this.id;
    }
    private int generateId(){
        return 1+(int)(Math.random()*10000000);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
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
}
package com.company;

/**
 * Created by usuario on 23/08/16.
 */
public class Password {
    //Estado o Atributos
    private int longitud=8;
    private String contraseña="";

    //Constructores
    public Password(){

    }
    public Password(int l){
        this.longitud=l;
    }

    //Comportamiento o Metodo
    public boolean isStrong(){
        int contM=0,contm=0,contN=0;
        for (int i=0;i<contraseña.length(); i++){

            if(Character.isUpperCase(contraseña.charAt(i))){
                contM+=1;
            }else if(Character.isLowerCase(contraseña.charAt(i))){
                contm+=1;
            }else if(Character.isDigit(contraseña.charAt(i))){
                contN+=1;
            }
        }
        if(contM>2 && contm>2 && contN>5){
            return true;
        }
        return false;
    }

    public String generatePass(){
        int max,min;
        for(int i=0; i<this.longitud; i++){
            if(1+(int)(Math.random()*3)==1){
                min=48;
                max=57;
            }else if(1+(int)(Math.random()*3)==2){
                min=65;
                max=90;
            }else{
                min=97;
                max=122;
            }
            contraseña=contraseña+Character.toString((char)rand(max,min));
        }
        return contraseña;
    }
    public int rand(int max, int min){
        return (int)(Math.random()*(max-min)+min);
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return (this.contraseña + " ");
    }
}

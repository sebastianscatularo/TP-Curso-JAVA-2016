package Clases;

public class Password {
    private int longitud=8;
    private String contraseña;

    public Password(){
        this.longitud=8;
        this.contraseña=generatePass();
    }

    public Password( int longitud){
        this.longitud=longitud;
        this.contraseña=generatePass();

    }

    private String generatePass(){
        String chars = "1234567890qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM";
        String pass="";
        for (int x=0;x<this.longitud;x++){
            pass = pass + chars.charAt((int)(Math.random()*chars.length()));
        }
        return pass;
    }

    public boolean isStrong(){
    int May=0, Min=0, digi=0;

    for(int x=0;x<longitud;x++){
        if (Character.isUpperCase(contraseña.charAt(x))){
            May++;
        }
        if (Character.isLowerCase(contraseña.charAt(x))){
            Min++;
        }
        if (Character.isDigit(contraseña.charAt(x))){
            digi++;
        }
    }
    if (May>2 && Min>1 && digi>5){
        return true;
    }
    else
        return false;

}
    @Override
    public String toString(){
        return (this.contraseña);
    }
}

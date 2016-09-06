
import java.util.Scanner;

//Creado por Favio Veron

public abstract class Empleado {


	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	
	//Constructores
	public Empleado(){
	}
	
	
	public Empleado(String nombre,String cedula,int edad, boolean casado,double salario){
		this.nombre=nombre;
		this.casado=casado;
		this.salario=salario;
		this.cedula=cedula;
		this.edad=edad;
		validacionEdad();
	}
	
	//Controla el rango de edad y  pide el ingreso de una nueva edad en caso de que la anterior no sea valida. 
	public void validacionEdad (){
		while(this.edad<18 || this.edad>45){
			System.out.println("Edad no valida. Ingrese edad nuevamente: ");
			Scanner sc = new Scanner(System.in);
			setEdad(sc.nextInt());
		}
	}
	
	//Retorna una clasificación segun la edad
	public String clasificadorEdad(){
		String clasificacion=" ";
		
		if (this.edad<=21){
			clasificacion="Principiante";
		} else if (this.edad >=22 && this.edad < 36){
			clasificacion="Intermedio";
		} else {
			clasificacion="Senior";
		}
		
		return clasificacion;
	}
	
	
	//Metodo que aumenta el salario de acuerdo a un porcentaje recibido como parámetro
	public void aumentadorSalario(float aumento){
		this.salario+=this.salario*(aumento/100);
	}
	
	//Metodo que imprime los datos del empleado
	
	public void imprimirDatos(){
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Cedula: "+this.cedula);
		System.out.println("Edad: "+this.edad);
		if(this.casado==true){
			System.out.println("Casado: SI");
		} else {
			System.out.println("Casado: NO");
		}
		System.out.println("Salario: "+this.salario);
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}

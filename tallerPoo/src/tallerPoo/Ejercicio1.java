package tallerPoo;
import  java.util.Scanner;
class Ejercicio1 {
	private Scanner t;
	String nombre;
	float sueldo;
	
	public Ejercicio1() {
		t=new Scanner(System.in);
		System.out.print("nombre del empleado: ");
		nombre=t.nextLine();
		System.out.print("Ingrese su sueldo: ");
		sueldo=t.nextFloat();
	}
	public void Impuestos() {
		if(sueldo>1500000) {
			System.out.println("debe pagar impuestos.");
		}else {
			System.out.println("No pagara  impuestos.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 dato;
		dato=new Ejercicio1();
		dato.Impuestos();
		
	}

}

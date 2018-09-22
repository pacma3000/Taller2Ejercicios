package tallerPoo;
import java.util.*;
class Ejercicio2 {
	private Scanner t;
	int y;
	int x;
	int suma;
	int resta;
	int multiplicar;
	int dividir;
	
	public Ejercicio2() {
		t=new Scanner(System.in);
		System.out.println("Ingrese el numero 1:");
		y=t.nextInt();
		System.out.println("Ingrese el numero 2:");
		x=t.nextInt();
	}
	
	public void suma() {
		
		suma=y+x;
		System.out.println(y+" + "+x+" = "+suma);
	}

	public void resta() {
		
		resta=x-y;
		System.out.println(y+" - "+x+" = "+resta);
	}

	public void multiplicar() {
		
		multiplicar=y*x;
		System.out.println(y+" x "+x+" = "+multiplicar);
	}

	public void dividir() {
		
		dividir=y/x;
		if(y==0 | x==0) {
			System.out.println("no ingresar ceros.");
		}else {
			System.out.println(y+" / "+x+" = "+dividir);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2 resultado=new Ejercicio2();
		resultado.suma();
		resultado.resta();
		resultado.multiplicar();
		resultado.dividir();
	}

}

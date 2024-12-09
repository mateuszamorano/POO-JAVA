package Metodos;

public class Usar {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		double resul = c1.somar(3, 5.6);
		System.out.println(resul);
		
		double resul1 = c1.dividir(10, 2, 3);
		System.out.println(resul1);
		
		double resul2 = c1.mult(10, 2);
		System.out.println(resul2);
		
		double resul3 = c1.subt(10, 2);
		System.out.println(resul3);
	}
}
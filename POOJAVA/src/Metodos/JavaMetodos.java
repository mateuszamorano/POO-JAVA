package Metodos;

public class JavaMetodos {
	int valor1, nasc;
	double valor2;
	
	public int idade(int nasc) {
		int idade = 2024 - nasc;
		return idade;
	}
	public void valor(int valor2, int valor1) {
		double media = valor2 * valor1;
		System.out.println(media);
	}
	public String nome(String valor) {
		return valor;
	}
	public boolean estado(int namoro) {
		boolean real;
		if (namoro >= 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
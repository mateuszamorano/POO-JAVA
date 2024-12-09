package Metodos;

public class JavaMetodos {
	int nasc, vig;
	double media;
	
	public int idade(int nasc) {
		int idade = 2024 - nasc;
		return idade;
	}
	public void valor(int vig) {
		double media = nasc - vig;
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
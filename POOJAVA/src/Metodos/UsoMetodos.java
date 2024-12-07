package Metodos;

import java.util.Scanner;

public class UsoMetodos {

	public static void main(String[] args) {
		JavaMetodos jm = new JavaMetodos();
		Scanner dgt = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento: ");
		int retorno = jm.idade(dgt.nextInt());
		System.out.println(retorno);
		jm.valor(10, 10);
		String nome = jm.nome("Mateus");
		System.out.println(nome);
		boolean namoro = jm.estado(4);
		System.out.println(namoro);
		}

}
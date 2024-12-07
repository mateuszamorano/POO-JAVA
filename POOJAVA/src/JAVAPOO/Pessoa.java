package JAVAPOO;

public class Pessoa {
	String nome, endereco;
	int idade;
	
	public void comer(String comida){
		System.out.println(nome+ " está comendo "+ comida);
	}
	public void dormir() {
		System.out.println(nome +" está dormindo");
	}
	public void apresentar() {
		System.out.printf("Eu me amo %s tenho %d e moro no %s", nome, idade, endereco);
	}
}
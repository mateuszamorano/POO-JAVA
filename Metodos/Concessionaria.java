package Metodos;

public class Concessionaria {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro("Ferrari");
		Carro c3 = new Carro("Ferrari, ", "vermelho");
		Carro c4 = new Carro("Ferrari, ", "vermelho", 140000);
		System.out.printf("O modelo do carro é: %s a cor dele é: %s e o preço do mesmo: %.2f \n", c4.modelo, c4.cor, c4.preco);
		
		
		Honda h1 = new Honda();
		Honda h2 = new Honda("Civic");
		Honda h3 = new Honda("Civic, ", "vermelho");
		Honda h4 = new Honda("Civic, ", "vermelho", 140000);
			
		System.out.printf("O modelo do carro é: %s a cor dele é: %s e o preço do mesmo: %.2f \n", h4.modelo, h4.cor, h4.preco);
		
		c4.ligar();
		c4.acelerar();
	}
}
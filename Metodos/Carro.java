package Metodos;

public class Carro {
    String modelo, cor, all;
    double preco;
    boolean ligado, acelerando;

    public Carro() {
    }

    public Carro(String mod) {
        this.modelo = mod;
        this.ligado = false;
    }

    public Carro(String mod, String cor1) {
        this.modelo = mod;
        this.cor = cor1;
        this.ligado = false;
    }

    public Carro(String mod, String cor1, double preco1) {
        this.modelo = mod;
        this.cor = cor1;
        this.preco = preco1;
        this.ligado = false;
        this.acelerando = false;
    }

    public void ligar() {
        if (ligado == false) {
            System.out.println("O carro está ligado!");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligar() {
        if (ligado == false) {
            System.out.println("O carro já está desligado!");
        } else {
            System.out.println("O carro está desligado!");
            ligado = false; 
        }
    }

    public void acelerar() {
        if (ligado == true) {
        	if (acelerando == false) {
            System.out.println("O carro acelerou!");
            acelerando = true;
        }
        }
        if (ligado == true){
        }
        else if (acelerando == true) {
        	System.out.println("O carro já está acelerando!");
        }
        if (ligado == false) {
        	System.out.println("O carro não pode acelerar pois está desligado!");
        }
        
    }

    public void frear() {
    	if (ligado == true) {
    	}
    	else if (acelerando == false){
    		System.out.println("O carro !");
    	}

    }
}
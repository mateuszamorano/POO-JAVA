package Metodos;

public class Calculadora {
	double somarPed, soma1, soma2, soma3;
	
		public double somar(double soma1, double soma2) {
			return soma1 + soma2;
		}
		public double somar(double soma1, double soma2, double soma3) {
			return soma1 + soma2 + soma3;
		}
		public double somarPedindo(double somarPed) {
			somarPed = soma1 + soma2 + soma3;
			return somarPed; /*RESOLVER*/
		}
		public double dividir(double divisão1, double divisão2) {
			return divisão1 / divisão2;
		}
		public double dividir(double divisão1, double divisão2, double divisão3) {
			return divisão1 / divisão2 / divisão3;
		}
		public double mult(double mult1, double mult2){
			return mult1 * mult2;
		}
		public double mult(double mult1, double mult2, double mult3){
			return mult1 * mult2 * mult3;
		}
		public double subt(double subt1, double subt2, double subt3) {
			return subt1 - subt2 - subt3;
		}
		public double subt(double subt1, double subt2) {
			return subt1 - subt2;
		}
}
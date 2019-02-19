package br.com.desafio.sys.primo;

public class Desafio1 {

	public static boolean primo(int numero) {
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int numeroPrimoMaior(int numero1, int numero2) {
		
		if (primo(numero1) && !primo(numero2)) {
			throw new IllegalArgumentException("numero " + numero2 + " nao e primo.");
		} else if (!primo(numero1) && primo(numero2)) {
			throw new IllegalArgumentException("numero " + numero1 + " nao e primo.");
		} else if (!primo(numero1) && !primo(numero2)) {
			throw new IllegalArgumentException("os numeros " + numero1 + ", " + numero2 + " nao sao primos.");
		}
		
		return Math.max(numero1, numero2);
	}
	

	public static void main(String[] args) {
		System.out.println(numeroPrimoMaior(2, 23));
		System.out.println(numeroPrimoMaior(37, 37));
		System.out.println(numeroPrimoMaior(43, 37));

	}

}

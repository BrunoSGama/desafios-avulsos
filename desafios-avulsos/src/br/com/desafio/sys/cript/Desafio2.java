package br.com.desafio.sys.cript;

public class Desafio2 {
	
	public static String criptografar(String texto) {
		StringBuilder sb = new StringBuilder();
		
		if (texto != null && !texto.isEmpty()) {
			for (char c: texto.toCharArray() ) {
				if (c == 'x') {
					sb.append("a");
				} else if (c == 'X') {
					sb.append("A");
				} else if (c == 'y') {
					sb.append("b");
				} else if (c == 'Y') {
					sb.append("B");
				} else if (c == 'z') {
					sb.append("c");
				} else if (c == 'Z') {
					sb.append("C");
				} else {
					sb.append(Character.toChars(c+3));
				}
			}	
		} else {
			return "sem texto para criptografar";
		}
		
		return sb.toString();
	}
	
	public static String decriptografar(String texto) {
		StringBuilder sb = new StringBuilder();
		
		if (texto != null && !texto.isEmpty()) {
			for (char c: texto.toCharArray() ) {
				if (c == 'a') {
					sb.append("x");
				} else if (c == 'A') {
					sb.append("X");
				} else if (c == 'b') {
					sb.append("y");
				} else if (c == 'B') {
					sb.append("Y");
				} else if (c == 'c') {
					sb.append("z");
				} else if (c == 'C') {
					sb.append("Z");
				} else {
					sb.append(Character.toChars(c-3));
				}
			}	
		} else {
			return "sem texto para decriptografar";
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String texto = "Texto é um conjunto de palavras e frases encadeadas que permitem interpretação e transmitem uma mensagem. É qualquer obra escrita em versão original e que constitui um livro ou um documento escrito. Um texto é uma unidade linguística de extensão superior à frase.";
		
		System.out.println(criptografar(null));
		System.out.println(decriptografar(null));
		System.out.println(criptografar(texto));
		System.out.println(decriptografar(criptografar(texto)));
		
	}

}

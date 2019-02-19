package br.com.desafio.sys.fib;

import java.math.BigInteger;

public class Desafio3 {

	private static BigInteger[] valores = new BigInteger[]{ BigInteger.ZERO, BigInteger.ONE };

	public static BigInteger fibonacci(final int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("numero passado como parametro precisa ser maior que 0.");
		}

		if (numero < valores.length) {
			return valores[numero];
		}

		final BigInteger[] novosValores = new BigInteger[numero + 1];
		System.arraycopy(valores, 0, novosValores, 0, valores.length);

		for (int i = valores.length; i < novosValores.length; i++) {
			novosValores[i] = novosValores[i - 1].add(novosValores[i - 2]);
		}

		valores = novosValores;
		return valores[numero];

	}

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(20));
		System.out.println(fibonacci(99));
		System.out.println(fibonacci(150));
		System.out.println(fibonacci(300));
		System.out.println(fibonacci(500));
		System.out.println(fibonacci(1000));
		System.out.println(fibonacci(5000));
		System.out.println(fibonacci(10000));
		System.out.println(fibonacci(20000));
	}

}

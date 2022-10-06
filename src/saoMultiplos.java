import java.util.Scanner;

public class saoMultiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um número: ");
		int i = sc.nextInt();
		System.out.println("digite outro número: ");
		int n = sc.nextInt();

		if (i % 2 == 0 && n % 2 == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		sc.close();

	}
}
//Leia 2 valores inteiros (A e B). 
//deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos","
//+ indicando se os valores lidos são múltiplos entre si.
//Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
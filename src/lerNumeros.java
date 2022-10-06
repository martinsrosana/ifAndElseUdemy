import java.util.Scanner;

public class lerNumeros {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		System.out.println("digite um número: ");
		int i=sc.nextInt();
        
		if (i <0) {
			System.out.println(" Negativo!");
		} else {
			System.out.println("Não Negativo!");
		}
		sc.close();
	}
}

//Fazer um programa para ler um número inteiro,
//e depois dizer se este número é negativo ou não.
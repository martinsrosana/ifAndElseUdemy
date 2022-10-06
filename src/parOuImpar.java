import java.util.Scanner;

public class parOuImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
			System.out.println("digite um número: ");
			int i=sc.nextInt();
	        
			if (i % 2 ==0) {
				System.out.println(" Par");
			} else {
				System.out.println("Impar");
			}
			sc.close();
		}
	}


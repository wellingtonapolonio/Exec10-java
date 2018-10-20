package appkication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		
		int d;
		
		if (hi < hf) {
			d = hi- hf;
		
		}
		else {
			d = 24 - hi + hf;
		}
		
		System.out.println("O jogo durou "+ d + " Horas");
		
		sc.close();
		

	}

}

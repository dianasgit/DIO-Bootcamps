package calculadoraRankeada;

import java.util.Scanner;
public class CalculadoraPartidaRankeada {

	public static void main(String[] args) {

		int vitorias;
		int derrotas;
		int saldo;
		String ranking = " ";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Digite a quantidade de vitórias: ");
		vitorias = scan.nextInt();
		
		System.out.println ("Digite a quantidade de Derrotas: ");
		derrotas = scan.nextInt();
		
		saldo = vitorias - derrotas;
		
		if (saldo <10) {
			ranking = "Ferro";
		}else if (saldo >= 11 && saldo <= 20) {
			ranking = "Bronze";
		}else if (saldo >= 21 && saldo <= 50) {
			ranking = "Prata";	
		}else if (saldo >= 51 && saldo <= 80) {
			ranking = "Ouro";
		}else if (saldo >= 81 && saldo <= 90) {
			ranking = "Diamante";
		}else if (saldo >= 91 && saldo <= 100) {
			ranking = "Lendário";
		}else if (saldo >= 101) {
			ranking = "Imortal";
		}


		System.out.println("O Herói tem um saldo de " + saldo  + " votórias e está no nível de " + ranking +".");
				
	} //main
} // class

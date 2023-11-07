package desafioHerois02;
import java.util.Scanner;

public class ClassificacaoHerois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String name = " ";
		long xp = 0;
		String nivel = " ";

		System.out.println("Digite o nome do seu Herói:");
		name = scan.next();

		System.out.println("\nDigite a valor da experigência (XP) do Herói "+ name + ":");
		xp = scan.nextLong();
		if (xp<1000){nivel = "Ferro";
		}else if (xp<= 1001 || xp <2000){nivel = "Bronze";
		}else if (xp<= 2001 || xp <5000){nivel = "Prata";
		}else if (xp<= 5001 || xp <7000){nivel = "Ouro";
		}else if (xp<= 7001 || xp <8000){nivel = "Platina";
		}else if (xp<= 8001 || xp <9000){nivel = "Ascendente";
		}else if (xp<= 9001 || xp <10000){nivel = "Imortal";
		}else if (xp >= 10001){nivel = "Radiante";
		}

		System.out.println("O Herói de nome " + name + " está no nível de " + nivel + " com " + xp + "XPs. ");

	} // main
} //class

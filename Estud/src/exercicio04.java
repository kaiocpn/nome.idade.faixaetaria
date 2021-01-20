import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome,faixaEtaria;
		
		System.out.println("Qual o seu nome ?");
		nome = ler.next();
		
		System.out.println("Qual sua idade ?");
		idade = ler.nextInt();
		
		if (idade >=0 && idade <=11) {
			faixaEtaria = "Crianca";
		} 	else if (idade >=12 && idade <=17) {
				faixaEtaria = "Adolescente";
		}		else if (idade >=18 && idade<=30) {
					faixaEtaria = "Jovem";
		}			else if (idade >=3 && idade <=59) {
						faixaEtaria="Adulto";
	}					else {	
							faixaEtaria="Ancião";
}
		
		if (idade <=0 && idade <=11) {
			System.out.println("Ola " + nome + " sua idade é " + idade + ", voce é um(a) " + faixaEtaria);
		} 	else if (idade ==12 && idade <=17) {
				System.out.println("Ola " + nome + " sua idade é " + idade + ", voce é um(a) " + faixaEtaria);
		}		else if (idade ==18 && idade<=30) {
					System.out.println("Ola " + nome + " sua idade é " + idade + ", voce é um(a) " + faixaEtaria);
		}			else if (idade ==3 && idade <=59) {
						System.out.println("Ola " + nome + " sua idade é " + idade + ", voce é um(a) " + faixaEtaria);
	}					else {	
							System.out.println("Ola " + nome + " sua idade é " + idade + ", voce é um(a) " + faixaEtaria);	
}	
		
		
		
		
	}
}

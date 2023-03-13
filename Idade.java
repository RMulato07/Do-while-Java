import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		String i="sim";
		int idade,anoAtual,anoNasc;
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Digite o ano atual: ");
			anoAtual = in.nextInt();
			System.out.println("Digite o ano de Nascimento: ");
			anoNasc = in.nextInt();
			idade = anoAtual-anoNasc;
			System.out.println("sua idade é "+idade);
			if(idade<=18) {
				System.out.println("voce é maior de idade");
			}else {
				System.out.println("voce é menor de idade");
			}
			System.out.println("voce deseja continuar? sim ou nao");
			i = in.next();
			
			
		}while(i.equalsIgnoreCase("sim"));
	}

}

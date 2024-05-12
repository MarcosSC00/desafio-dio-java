package contabanco;

import java.text.ParseException;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class ContaTerminal {
	
public static boolean validaDados(int numero, String agencia, String nomeCliente, double saldo) {
		
		if (numero < 0 || saldo < 0d) {
			System.out.println("Erro! Insira apenas valores positivos.");
			return false;
		}
		if(agencia == null || nomeCliente == null || agencia.trim() == "" || nomeCliente.trim() == "") {
			System.out.println("Erro! Ops, parece que voce nao preencheu todos os campos.");
			return false;
		}

		String mask = "####-#";
		MaskFormatter maskFormated;
		
		try {
			maskFormated = new MaskFormatter(mask);
			maskFormated.setValueContainsLiteralCharacters(false);;
			System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+maskFormated.valueToString(agencia)+", conta " +numero+" e seu saldo "+saldo+" já está disponível para saque.");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe seu nome:");
			String nomeCliente = input.nextLine();
				
			System.out.println("Insira o numero da sua conta:");
			int numero = input.nextInt();
			input.nextLine();
			
			System.out.println("Insira a sua agencia:");
			String agencia = input.nextLine();
			
			System.out.println("Informe seu saldo bancario:");
			double saldo = input.nextDouble();
			
			if(!validaDados(numero, agencia, nomeCliente, saldo)) {
				return;
			}
		}
	}
}


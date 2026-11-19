import java.util.Scanner;
public class Loja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Produtos: 1: Boné - R$50,00;  2: Calça - R$ 80,00;  3: Tênis - 150,00;");
		System.out.println("Digite o código do produto: ");
		int codigo = entrada.nextInt();
		System.out.println("Digite a Quantidade desejada: ");
		int quant = entrada.nextInt();
		
		switch (codigo) {
			case 1:
				double valor = quant*50.00;
				System.out.println("Produto: Boné; Preço: " + valor);
				
			break;
			case 2:
				valor = quant*80.00;
				System.out.println("Produto: Calça; Preço: " + valor);
			break;
			case 3:
				valor = quant*150.00;
				System.out.println("Produto: Tênis; Preço: " + valor);
			break;
			default:
				System.out.println("Opção inválida");

		}
	}
}
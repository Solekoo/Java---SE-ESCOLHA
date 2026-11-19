import java.util.Scanner;
public class NotaFrequencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota: ");
		double nota = entrada.nextInt();
		System.out.println("Digite seu percentual de frequência: ");
		double frequencia = entrada.nextInt();

		if (nota >= 7 && frequencia >= 75) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
	}
}
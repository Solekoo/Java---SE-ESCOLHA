import java.util.Scanner;
public class FrequenciaNota {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua nota (0 a 10): ");
		double nota = entrada.nextInt();
		System.out.println("Digite seu percentual de frequência: ");
		double frequencia = entrada.nextInt();

		if (nota >= 6 && frequencia >= 75) {
			if (nota >= 9 && frequencia >= 90) {
				System.out.println("Aluno destacado!");
			} else {
				System.out.println("Aluno aprovado!");
			}
			
		} else if (frequencia >= 75) {
			System.out.println("Aluno em reavaliação!");
		} else {
			System.out.println("Aluno reprovado por frequência!");
	}
}
}
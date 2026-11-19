import java.util.Scanner;
public class Traduzir {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o código pra selecionar o turno: 1 - Manhã; 2 - Tarde;");
		int turno = entrada.nextInt();
		System.out.println("Digite o código pra selecionar uma disciplina: Manhã: 1 - Matemática;  2 - Português;  Tarde: 1 - História;");
		int disciplina = entrada.nextInt();
		
		switch (turno) {
			case 1:
			switch (disciplina) {
				case 1:
					System.out.println("Matemática");
				break;
				case 2:
					System.out.println("Português");
				break;
				default:
					System.out.println("Disciplina não disponível no periodo da manhã");
			break;
			}
			break;
			
			case 2:
			switch (disciplina) {
				case 1:
					System.out.println("História");
				break;
				default:
					System.out.println("Disciplina não disponível no periodo da tarde");
				break;
			}
			break;
			default:
			System.out.println("Turno inválido");
			break;
		}
}
}
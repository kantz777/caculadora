import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2, resultado;
		char operador;

		System.out.println("=== Calculadora Simples ===");

		System.out.print("Digite o primeiro nC:mero: ");
		numero1 = scanner.nextDouble();

		System.out.print("Digite o operador (+, -, *, /): ");
		operador = scanner.next().charAt(0);

		System.out.print("Digite o segundo nC:mero: ");
		numero2 = scanner.nextDouble();

		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Erro: divisC#o por zero!");
				scanner.close();
				return;
			}
			break;
		default:
			System.out.println("Operador invC!lido!");
			scanner.close();
			return;
		}

		System.out.println("Resultado: " + resultado);
		scanner.close();
	}
}

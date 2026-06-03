/*
 * Calculadora em Java
 * Projeto para praticar Lógica:
 * - Scanner
 * - If/Else
 * - Switch Case
 * - Do While
 * - Try Catch
 * - Operações Matemáticas
 *
 * Autor: André Bottari
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            double valorA = 0, valorB = 0, resultadoOperacao = 0;

            System.out.println("\n===== CALCULADORA =====\n" +
                    "1-Soma\n" +
                    "2-Subtração\n" +
                    "3-Multiplicação\n" +
                    "4-Divisão\n" +
                    "0-Sair" +
                    "\nDigite o valor da operação desejada:\n");

            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Digite apenas números!\n");
                scanner.nextLine();
                opcao = -1;
            }

            if (opcao >= 1 && opcao <= 4) {

            try {
                System.out.print("Digite o valor de A: ");
                valorA = scanner.nextDouble();

                System.out.print("Digite o valor de B: ");
                valorB = scanner.nextDouble();

            } catch (Exception e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
                continue;
            }

                switch (opcao) {
                    case 1:
                        resultadoOperacao = valorA + valorB;
                        System.out.println("SOMA: A+B");
                        System.out.println("O resultado da SOMA é: " + resultadoOperacao + "\n");
                        break;

                    case 2:
                        resultadoOperacao = valorA - valorB;
                        System.out.println("SUBTRAÇÃO: A-B");
                        System.out.println("O resultado da SUBTRAÇÃO é: " + resultadoOperacao + "\n");
                        break;

                    case 3:
                        resultadoOperacao = valorA * valorB;
                        System.out.println("MULTIPLICAÇÃO: AxB");
                        System.out.println("O resultado da MULTIPLICAÇÃO é: " + resultadoOperacao + "\n");
                        break;

                    case 4:
                        while (valorB == 0) {
                            System.out.println("Não existe divisão por Zero!");
                            System.out.println("Digite o valor de B");
                            valorB = scanner.nextDouble();
                        }

                        resultadoOperacao = valorA / valorB;
                        System.out.println("DIVISÃO: A/B");
                        System.out.println("O resultado da DIVISÃO é: " + resultadoOperacao + "\n");
                        break;
                }

            } else if (opcao == 0) {
                System.out.println("Encerrando...");

            } else {
                System.out.println("Opção inválida! Digite uma opção válida.\n");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
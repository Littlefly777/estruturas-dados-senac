import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] faturamento = new double[5];

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o faturamento do caixa " + (i + 1) + ": ");
            faturamento[i] = scanner.nextDouble();
        }

        double soma = 0;
        double maiorValor = faturamento[0];
        double menorValor = faturamento[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        // Processamento
        for (int i = 0; i < 5; i++) {
            soma += faturamento[i];

            if (faturamento[i] > maiorValor) {
                maiorValor = faturamento[i];
                indiceMaior = i;
            }

            if (faturamento[i] < menorValor) {
                menorValor = faturamento[i];
                indiceMenor = i;
            }
        }

        double media = soma / 5;

        // Desafio extra
        int acimaMedia = 0;
        for (int i = 0; i < 5; i++) {
            if (faturamento[i] > media) {
                acimaMedia++;
            }
        }

        // Saída
        System.out.println("\n--- RESUMO DO DIA ---");
        System.out.printf("Total do dia: %.2f\n", soma);
        System.out.printf("Media por caixa: %.2f\n", media);
        System.out.printf("Maior venda: Caixa %d com %.2f\n", indiceMaior + 1, maiorValor);
        System.out.printf("Menor venda: Caixa %d com %.2f\n", indiceMenor + 1, menorValor);
        System.out.println("Caixas acima da media: " + acimaMedia);

    }
}

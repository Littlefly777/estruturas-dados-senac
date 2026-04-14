package recursividade;

public class Recursividade{

public static int somaRecursividade(int n) {
    if (n <= 0) {
        return 0;
    }
    return n + somaRecursividade(n - 1);
 }
 public static int somaInterativa(int n) {
    int soma = 0;
    for (int i = 1; i <= n; i++) {
        soma += i;
    }
    return soma;
 }
 public static void main(String[] args) {
    int numero = 6;

    int resultadoRecursivo = somaRecursividade(numero);
    int resultadoInterativo = somaInterativa(numero);

    System.out.println("Soma recursiva é: " + resultadoRecursivo);
    System.out.println("Soma interativa é: " + resultadoInterativo);
  }
}

import java.util.Scanner;

public class conversor {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Conversor de temperatura");
    System.out.println("Digite qauntos graus deseja converter");
    double graus = scanner.nextDouble();
    System.out.println("Digite a unidade de temperatura atual(C/F/K)");
    char unidadeAtual = scanner.next().toUpperCase().charAt(0);
    System.out.println("Digite a unidade de temperatura que deseja converter (C/F/K)");
    char unidade = scanner.next().toUpperCase().charAt(0);
    double resultado;
    if (unidadeAtual == 'C' && unidade == 'F') {
      resultado = graus * 1.8 + 32;
      System.out.println(resultado+"F");
    } else if (unidadeAtual == 'F' && unidade == 'C') {
      resultado = graus - 32 * 5 / 9;
      System.out.println(resultado+"C");
    } else if (unidadeAtual == 'C' && unidade == 'K') {
      resultado = graus + 273.15;
      System.out.println(resultado+"K");
    } else if (unidadeAtual == 'F' && unidade == 'K') {
      resultado = graus - 32 / 1.8 + 273.15;
      System.out.println(resultado+"K");
    } else if(unidadeAtual == 'K' && unidade == 'C') {
      resultado = graus - 273.15;
      System.out.println(resultado+"C");
    } else {
      resultado = graus - 273.15 * 1.8 + 32;
      System.out.println(resultado+"F");
    }
    scanner.close();
  }
}
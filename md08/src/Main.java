import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int value = 0;
    System.out.println("Informe quatro valores para cálculo da média");
    Scanner cmd = new Scanner(System.in);
    System.out.print("Informe o primeiro valor: ");
    value += cmd.nextInt();
    System.out.print("Informe o segundo valor: ");
    value += cmd.nextInt();
    System.out.print("Informe o terceiro valor: ");
    value += cmd.nextInt();
    System.out.print("Informe o quarto valor: ");
    value += cmd.nextInt();
    System.out.print("A média é igual a: " + value/4);
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Integer value;
    Scanner cmd = new Scanner(System.in);
    System.out.print("Informe um valor: ");
    value = cmd.nextInt();
    System.out.print("A média é igual a: " + value);
  }
}
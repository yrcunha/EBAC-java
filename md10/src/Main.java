import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int value = 0;
    Scanner cmd = new Scanner(System.in);
    System.out.print("Qual a primeira nota: ");
    value += cmd.nextInt();
    System.out.print("Qual a segunda nota: ");
    value += cmd.nextInt();
    System.out.print("Qual a terceira nota: ");
    value += cmd.nextInt();
    System.out.print("Qual a quarta nota: ");
    value += cmd.nextInt();
    int result = value/4 < 5 ? 1 : value/4 >= 5 &&  value/4 < 7 ? 2 : 3 ;
    switch (result) {
      case 1 -> System.out.print("Aluno reprovado");
      case 2 -> System.out.print("Aluno de recuperação");
      default -> System.out.print("Aluno aprovado");
    }
  }
}

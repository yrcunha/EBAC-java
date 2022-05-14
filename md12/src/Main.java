import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    int value;
    System.out.print("Qual atividade você deseja executar? (1 ou 2) ");
    Scanner cmd = new Scanner(System.in);
    value = cmd.nextInt();
    if(value != 1 && value != 2) {
      throw new Error("A opção não está na lista, escolha uma atividade válida!");
    } else if(value == 1) {
      new Atividade01();
    } else {
      new Atividade02();
    }
  }
}

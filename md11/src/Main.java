import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    String name;
    String sexo;
    boolean comando = true;
    ArrayList<Pessoas> homens = new ArrayList<>();
    ArrayList<Pessoas> mulheres = new ArrayList<>();
    System.out.println("Escreva nome e sexo (M ou F) separados por virgula");
    while(comando) {
      Scanner cmd = new Scanner(System.in);
      System.out.print("Qual a nome: ");
      name = cmd.next();
      System.out.print("Qual a sexo (M ou F): ");
      sexo = cmd.next();
      Pessoas pessoa = new Pessoas(name, sexo.toUpperCase());
      if(pessoa.sexo.equals("M")) {
        homens.add(pessoa);
      } else if (pessoa.sexo.equals("F")) {
        mulheres.add(pessoa);
      } else {
        throw new Error("Houve um erro na declaração do sexo!");
      }
      System.out.print("Deseja continuar? (sim ou não) ");
      comando = cmd.next().equals("sim");
    }
    System.out.println("Segue lista de homens: " + homens.toString());
    System.out.print("Segue lista de mulheres: " + mulheres.toString());
  }
}

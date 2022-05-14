import java.util.ArrayList;
import java.util.Scanner;

public class Atividade02 {
  public Atividade02(){
    System.out.println("Liste nomes e sexo (M ou F) conforme modelo (NOME - SEXO)");
    System.out.print("Qual a lista: ");
    Scanner cmd = new Scanner(System.in);
    String lista;
    lista = cmd.next();
    ArrayList<Pessoas> homens = new ArrayList<>();
    ArrayList<Pessoas> mulheres = new ArrayList<>();
    for(String dados: lista.split(",")) {
      Pessoas pessoa = construirPessoa(dados);
      if(pessoa.sexo.equals("M")) {
        homens.add(pessoa);
      } else if (pessoa.sexo.equals("F")) {
        mulheres.add(pessoa);
      } else {
        throw new Error("Houve um erro na declaração do sexo!");
      }
    }
    System.out.println("Segue lista de homens: " + homens.toString());
    System.out.print("Segue lista de mulheres: " + mulheres.toString());
  }

  public static Pessoas construirPessoa(String dado) {
    String[] information = dado.split("-");
    return new Pessoas(information[0], information[1].toUpperCase());
  }
}

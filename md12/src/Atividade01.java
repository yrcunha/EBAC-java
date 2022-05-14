import java.util.*;

public class Atividade01 {
  public Atividade01(){
    System.out.println("Liste nomes separados por virgula");
    String nomes;
    Scanner cmd = new Scanner(System.in);
    System.out.print("Qual os nomes: ");
    nomes = cmd.next();
    ArrayList<String> ordenar = new ArrayList<>();
    for(String nome: nomes.split(",")) ordenar.add(nome);
    Collections.sort(ordenar);
    System.out.println("Lista de nomes: " + ordenar);
  }
}

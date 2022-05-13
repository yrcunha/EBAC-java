public class Pessoa {
  private String name;
  private String age;
  private String cpf;

  public Pessoa(String name, String age, String cpf) {
    this.name = name;
    this.age = age;
    this.cpf = cpf;
    System.out.println("Olá, poderia me confirmar seus dados: ");
    System.out.println("nome: " + this.name);
    System.out.println("idade: " + this.age);
    System.out.println("cpf: " + this.cpf);
  }
}

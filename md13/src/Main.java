public class Main {
  public static void main(String[] args){
    PessoaFisica pessoaFisica = new PessoaFisica("Yuri", "71999999", "meumail@gmail.com", "111.111.111-26");
    System.out.println("Pessoa Física: " + pessoaFisica);
    PessoaJuridica pessoaJuridica = new PessoaJuridica("Yuri", "71999999", "meumail@gmail.com", "11.111.111/0001-26");
    System.out.println("Pessoa Jurídica: " + pessoaJuridica);
  }
}

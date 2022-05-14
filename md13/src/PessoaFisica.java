public class PessoaFisica extends Pessoa {
  String cpf;

  public PessoaFisica(String nome, String telefone, String email, String cpf) {
    super(nome, telefone, email);
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "{" +
      "cpf='" + cpf + '\'' +
      ", nome='" + nome + '\'' +
      ", telefone='" + telefone + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}

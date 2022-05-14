public class PessoaJuridica extends Pessoa {
  String cnpj;

  public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
    super(nome, telefone, email);
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "{" +
      "cnpj='" + cnpj + '\'' +
      ", nome='" + nome + '\'' +
      ", telefone='" + telefone + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}

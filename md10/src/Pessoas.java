public class Pessoas {
  String name;
  String sexo;

  public Pessoas(String name, String sexo) {
    this.name = name;
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "{" +
      "name='" + name + '\'' +
      ", sexo='" + sexo + '\'' +
      '}';
  }
}

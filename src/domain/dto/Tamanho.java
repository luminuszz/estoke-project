package domain.dto;

public class Tamanho {

    private   int quantidade;
  private   String nome;



  public Tamanho(int quantidade, String nome) {
      this.quantidade = quantidade;
      this.nome = nome;
  }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }


}

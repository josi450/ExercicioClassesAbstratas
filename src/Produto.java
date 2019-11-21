public abstract class Produto {
   
    private String cod;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String c, String n, String d, double pr) {
        this.setCod (c);
        this.setNome (n);
        this.setDescricao (d);
        this.setPreco(pr);
    }
   
   

    public String getCod() {
        return this.cod;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setCod(String c) {
        this.cod = c;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    public void setPreco(double pr) {
        this.preco = pr;
    }
   
   
  public abstract double calcularPrecoFinal();
  public abstract String imprimirDados();
     
}

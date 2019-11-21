public class Parafuso extends Produto {

private double comprimento;
private double diametro;

public Parafuso (String c, String n, String d, double p, double com, double dia ){
    super (c, n, d, p);
    this.setComprimento (com);
    this.setDiametro (dia);
}

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double c) {
        this.comprimento = c;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double d) {
        this.diametro = d;
    }
    
    public double calcularPrecoFinal(){
        double desconto = this.getPreco() *0.85;
        return desconto;
    }
    
    public String imprimirDados(){
       String dados = this.getCod() +this.getNome() +getDescricao() +this.getPreco() +this.getComprimento() +this.getDiametro();
       return dados;
        
    }
    
}

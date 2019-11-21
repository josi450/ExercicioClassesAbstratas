public class Motor extends Produto {
   
    private double potencia;
    private double rpm;

    public Motor(String c, String n, String d, double pr,double po, double r) {
        super(c,n,d,pr);
        this.setPotencia(po);
        this.setRpm(r);
    }

   
    public double getPotencia() {
        return this.potencia;
    }

    public double getRpm() {
        return this.rpm;
    }

    public void setPotencia(double po) {
        this.potencia = po;
    }

    public void setRpm(double r) {
        this.rpm = r;
    }
     public double calcularPrecoFinal(){
         double desconto= getPreco() * 0.95;
         return desconto;
     }
     
     public String imprimirDados(){
        String dados= getCod()+getNome()+getDescricao()+getPotencia()+getRpm();
        return dados;
     }
   
   
}
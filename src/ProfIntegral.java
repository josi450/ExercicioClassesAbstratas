
public class ProfIntegral extends Professores {
    
    private double salario;
    
    public ProfIntegral (String n, double s){
        super (n);
        this.setSalario (s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
     public double calcularsalarioliquido(){
        double salprofinte = this.getSalario()* 0.89;
        return salprofinte;
    }
                
}
    

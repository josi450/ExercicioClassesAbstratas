
public class ProfIntegral extends Professores {

    private int horas;
    
    public ProfIntegral (String n,int h){
        super (n);
        this.setHoras(h);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
     public void salarioIntegral(double sal){
        
       sal = this.horas * 40;
    }
      
}

    

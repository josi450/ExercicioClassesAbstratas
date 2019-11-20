
public class ProfHorista extends ProfIntegral{
    
   

    public ProfHorista (String n, int h){
        super (n, h);
       
    }
    
        
    public void salarioHorista (double salar){
        salar *= this.getHoras();
    }
    
     
}


    


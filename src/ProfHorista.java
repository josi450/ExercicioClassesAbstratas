public class ProfHorista extends Professores {
    
    private int horas;
    
    public ProfHorista (String n, int h){
        super (n);
        this.setHoras (h);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double calcularsalarioliquido(){
        double salprofhor = this.getHoras()*88.99 *0.95;
        return salprofhor;
    }
    
    
}

    


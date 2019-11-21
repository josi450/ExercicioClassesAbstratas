public class TestaProfessores {
   
    public static void main (String [] args){
        ProfIntegral pint1 = new ProfIntegral ("Luciano", 15);
        ProfHorista phor1 = new ProfHorista ("Alessandro", 10);
        
      
        
        System.out.println("Salario do Professor Integral: " + pint1.calcularsalarioliquido());
        System.out.println("Salario do Professor Horista: " +phor1.calcularsalarioliquido());
        
        
    }
}


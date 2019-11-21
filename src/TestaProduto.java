public class TestaProduto {

    public static void main (String []args){
        Motor m1 = new Motor ("123AB ", "Fiat ", "120CV ", 223.69 , 12 , 19800);
        Parafuso p1 = new Parafuso ("PFS56 ", "CSA ", "Sextavado ", 4 , 12.2 , 2.44);
        
        System.out.println (m1.calcularPrecoFinal());
        System.out.println (p1.calcularPrecoFinal());
        System.out.println (m1.imprimirDados());
        System.out.println (p1.imprimirDados());
        
    }
    
}


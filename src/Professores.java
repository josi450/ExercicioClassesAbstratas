
public abstract class Professores {
    
    private String nome;

    public Professores(String n) {
        this.setNome(n);
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    
    public abstract void calcularSalárioLíquido();
    
    
}

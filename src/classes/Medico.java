
package classes;


public class Medico {
    private String nome;
    private int crm;
    
    public Medico(String nome, int crm){
        this.crm = crm;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
    
    
}

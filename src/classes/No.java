
package classes;


public class No {
    private No apontProx;
    private No apontAnt;
    private String conteudo;
    
    public No(String nome){
        this.apontAnt = null;
        this.apontProx = null;
        this.conteudo = nome;
    }

    public No getApontProx() {
        return apontProx;
    }

    public void setApontProx(No apontProx) {
        this.apontProx = apontProx;
    }

    public No getApontAnt() {
        return apontAnt;
    }

    public void setApontAnt(No apontAnt) {
        this.apontAnt = apontAnt;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
    
    
}

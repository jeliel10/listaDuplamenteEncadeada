
package classes.revisaoProva;


public class NoQ05 {
    private NoQ05 apontProx;
    private NoQ05 apontAnt;
    private int conteudo;
    
    public NoQ05(int conteudo){
        this.apontProx = null;
        this.apontAnt = null;
        this.conteudo = conteudo;
    }

    public NoQ05 getApontProx() {
        return apontProx;
    }

    public void setApontProx(NoQ05 apontProx) {
        this.apontProx = apontProx;
    }

    public NoQ05 getApontAnt() {
        return apontAnt;
    }

    public void setApontAnt(NoQ05 apontAnt) {
        this.apontAnt = apontAnt;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }
    
    
}

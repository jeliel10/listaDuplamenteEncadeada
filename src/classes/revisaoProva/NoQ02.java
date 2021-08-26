
package classes.revisaoProva;

public class NoQ02 {
    private NoQ02 apontProx;
    private NoQ02 apontAnt;
    private int conteudo;
    
    public NoQ02(int conteudo){
        this.apontAnt = null;
        this.apontProx = null;
        this.conteudo = conteudo;
    }

    public NoQ02 getApontProx() {
        return apontProx;
    }

    public void setApontProx(NoQ02 apontProx) {
        this.apontProx = apontProx;
    }

    public NoQ02 getApontAnt() {
        return apontAnt;
    }

    public void setApontAnt(NoQ02 apontAnt) {
        this.apontAnt = apontAnt;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }
    
    
}

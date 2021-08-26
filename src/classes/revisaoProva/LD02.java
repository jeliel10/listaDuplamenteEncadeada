
package classes.revisaoProva;


public class LD02 {
    private NoQ02 apontPrim;
    private NoQ02 apontUltm;
    private int tamanho;
    
    public LD02(){
        this.apontPrim = null;
        this.apontUltm = null;
        this.tamanho = 0;
    }
    
    public void numInteir(){
        for(int i=0; i < 42000; i++){
            if(i%2 != 0){
                inserirInicio(i);
            }
        }
    }
    
    public String imprimir(){
        NoQ02 atual = this.apontPrim;
        String respt= "[";
        
        for(int i=0; i < tamanho;i++){
            respt+= atual.getConteudo()+ "|";
            atual = atual.getApontProx();
        }
        respt+= "]";
        return respt;
    }
    
    public void inserirInicio(int conteudo){
        NoQ02 node = new NoQ02(conteudo);
        
        if(tamanho == 0){
            this.apontPrim = node;
            this.apontUltm = node;
        }
        else{
            this.apontPrim.setApontAnt(node);
            node.setApontProx(this.apontPrim);
            this.apontPrim = node;
        }
        tamanho ++;
    }

    public NoQ02 getApontPrim() {
        return apontPrim;
    }

    public void setApontPrim(NoQ02 apontPrim) {
        this.apontPrim = apontPrim;
    }

    public NoQ02 getApontUltm() {
        return apontUltm;
    }

    public void setApontUltm(NoQ02 apontUltm) {
        this.apontUltm = apontUltm;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}

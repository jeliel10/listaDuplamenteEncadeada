
package classes.revisaoProva;

public class LD03 {
    private No03 apontPrim;
    private No03 apontUltm;
    private int tamanho;
    
    public LD03(){
        this.apontPrim = null;
        this.apontUltm = null;
        this.tamanho = 0;
    }
    
    public String imprimirListas(LD03 l01, LD03 l02){
        No03 atual1 = l01.apontPrim;
        No03 atual2 = l02.apontPrim;
        
        String respt01 = "[";
        String respt02 = "|";
        String resp = null;
        
        for(int i=0; i < l01.getTamanho(); i++){
            respt01+= atual1.getNum()+ "|";
            atual1 = atual1.getApontProx();
        }
        for(int i=0; i < l02.getTamanho(); i++){
            respt02+= atual2.getNum()+ "|";
            atual2 = atual2.getApontProx();
        }
        
        resp = respt01 + respt02 + "]";
        return resp;
    }
    
    public String imprimir(){
        No03 atual = this.apontPrim;
        String respt = "[";
        
        for(int i=0; i < tamanho; i++){
            respt+= atual.getNum();
            atual = atual.getApontProx();
        }
        respt+= "]";
        return respt;
    }
    
    public void inserirInicio(int num){
        No03 node = new No03(num);
        
        if(tamanho == 0){
            this.apontPrim = node;
            this.apontUltm = node;
        }
        else{
            node.setApontProx(this.apontPrim);
            this.apontPrim = node;
        }
        tamanho ++;
    }

    public No03 getApontPrim() {
        return apontPrim;
    }

    public void setApontPrim(No03 apontPrim) {
        this.apontPrim = apontPrim;
    }

    public No03 getApontUltm() {
        return apontUltm;
    }

    public void setApontUltm(No03 apontUltm) {
        this.apontUltm = apontUltm;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}

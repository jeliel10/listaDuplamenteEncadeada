
package classes.revisaoProva;


public class LD01 {
    private NoQ01 apontPrim;
    private NoQ01 apontUltm;
    private int tamanho;
    
    public LD01(){
        this.apontPrim = null;
        this.apontUltm = null;
        this.tamanho = 0;
    }
    
    public int imprimirTopo(){
        return this.apontUltm.getNum();
    }
    
    public String imprimir(){
        NoQ01 atual = this.apontPrim;
        String respt = "[";
        
        for(int i=0; i < tamanho; i++){
            respt+= atual.getNum() + "|";
            atual = atual.getApontProx();
        }
        respt+= "]";
        return respt;
    }
    
    public void empilhar(int num){
        if(num%2 == 0){
            inserirFinal(num);
        }
        else{
            desempilhar();
        }
    }
    
    public void desempilhar(){
        NoQ01 penultimo = retornaNo(tamanho - 1);
        penultimo.setApontProx(null);
        this.apontUltm = penultimo;
        
        tamanho --;
    }
    
    public NoQ01 retornaNo(int pos){
        NoQ01 atual = this.apontPrim;
        for(int i=0; i< pos; i++){
            atual = atual.getApontProx();
        }
        
        return atual;
    }
    
    public void inserirFinal(int num){
        NoQ01 node = new NoQ01(num);
        
        if(tamanho == 0){
            this.apontPrim = node;
            this.apontUltm = node;
        }
        else{
            this.apontUltm.setApontProx(node);
            this.apontUltm = node;
        }
        tamanho ++;
    }

    public NoQ01 getApontPrim() {
        return apontPrim;
    }

    public void setApontPrim(NoQ01 apontPrim) {
        this.apontPrim = apontPrim;
    }

    public NoQ01 getApontUltm() {
        return apontUltm;
    }

    public void setApontUltm(NoQ01 apontUltm) {
        this.apontUltm = apontUltm;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}

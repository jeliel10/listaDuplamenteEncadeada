
package classes.revisaoProva;


public class ListaDuplamenteQ05 {
    private NoQ05 apontPrim;
    private NoQ05 apontUltm;
    private int tamanho;
    
    public ListaDuplamenteQ05(){
        this.apontPrim = null;
        this.apontUltm = null;
        this.tamanho = 0;
    }
    
    public void elementosVetor(int[] vetor){
        for(int i=0; i< vetor.length; i++){
            inserirFinal(vetor[i]);
        }
    }
    
    public String imprimir(){
        NoQ05 atual = this.apontPrim;
        String respt = "[";
        
        for(int i=0; i < tamanho; i++){
            respt+= atual.getConteudo() + "| "; 
            atual = atual.getApontProx();
        }
        
        respt+= "]";
        return respt;
    }
    
    public void inserirFinal(int conteudo){
        NoQ05 node = new NoQ05(conteudo);
        
        if(tamanho == 0){
            inserirInicio(conteudo);
        }
        else{
            this.apontUltm.setApontProx(node);
            node.setApontAnt(this.apontUltm);
            this.apontUltm = node;
            tamanho ++;
        }
    }
    public void inserirInicio(int conteudo){
        NoQ05 node = new NoQ05(conteudo);
        
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
    
    public NoQ05 retornaNo(int posicao){
        NoQ05 atual = this.apontPrim;
        
        for(int i=0; i < posicao; i++){
            atual = atual.getApontProx();
        }
        
        return atual;
    }

    public NoQ05 getApontPrim() {
        return apontPrim;
    }

    public void setApontPrim(NoQ05 apontPrim) {
        this.apontPrim = apontPrim;
    }

    public NoQ05 getApontUltm() {
        return apontUltm;
    }

    public void setApontUltm(NoQ05 apontUltm) {
        this.apontUltm = apontUltm;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}

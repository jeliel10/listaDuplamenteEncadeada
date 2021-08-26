
package classes;


public class ListaDuplamente {
   private No apontPrim;
   private No apontUlt;
   private int tamanho;
   
   public ListaDuplamente(){
       this.apontPrim = null;
       this.apontUlt = null;
       this.tamanho = 0;
   }
   
   public void removerInicio(){
       this.apontPrim = this.apontPrim.getApontProx();
       this.apontPrim.setApontAnt(null);
       
       tamanho --;
   }
   
   public void removerFinal(){
       if(tamanho == 0){
           removerInicio();
       }
       else{
           this.apontUlt = this.apontUlt.getApontAnt();
           this.apontUlt.setApontProx(null);
           
           tamanho --;
       }
   }
   
   public void removerPosicao(int pos){
       int posicao = pos -1;
       
       if(tamanho == 1){
           removerInicio();
       }
       else if(posicao == tamanho){
           removerFinal();
       }
       else{
           No atual = retornaNo(posicao);
           No anterior = retornaNo(posicao - 1);
           No posterior = retornaNo(posicao + 1);
           
           anterior.setApontProx(posterior);
           posterior.setApontAnt(anterior);
           
           tamanho --;
       }
   }
   public void inserirPosicao(String nome, int pos){
       int posicao = pos - 1;
       
       if(posicao == 0){
           inserirInicio(nome);
       }
       else if(posicao == tamanho){
           inserirFinal(nome);
       }
       else{
           No node = new No(nome);
           No anterior = retornaNo(posicao - 1);
           No posterior = anterior.getApontProx();
           node.setApontAnt(anterior);
           anterior.setApontProx(node);
           node.setApontProx(posterior);
           posterior.setApontAnt(node);
           
           tamanho ++;
       }

   }
   
   public No retornaNo(int pos){
       No atual = this.apontPrim;
       
       for(int i=0; i < pos; i++){
           atual = atual.getApontProx();
       }
       
       return atual;
   }
   public void inserirInicio(String nome){
       No node = new No(nome);
       
       
       if(tamanho == 0){
           this.apontPrim = node;
           this.apontUlt = node;
       }
       else{
           node.setApontProx(this.apontPrim);
           this.apontPrim.setApontAnt(node);
           this.apontPrim = node;
       }
       
       tamanho++;
   }
   
   public void inserirFinal(String nome){
       No node = new No(nome);
       
       if(tamanho == 0){
           inserirInicio(nome);
       }
       else{
           this.apontUlt.setApontProx(node);
           node.setApontAnt(this.apontUlt);
           this.apontUlt = node;
           this.apontUlt.setApontProx(null);
           
           tamanho ++;
       }
   }
       
   
   public String imprimir(){
       No atual = this.apontPrim;
       String respt = "[";
       
       for(int i=0; i < tamanho; i++){
           respt+= atual.getConteudo() + " | ";
           atual = atual.getApontProx();
       }
       respt+= "]";
       return respt;
   }

    public No getApontPrim() {
        return apontPrim;
    }

    public void setApontPrim(No apontPrim) {
        this.apontPrim = apontPrim;
    }

    public No getApontUlt() {
        return apontUlt;
    }

    public void setApontUlt(No apontUlt) {
        this.apontUlt = apontUlt;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
   
   
    
    
}

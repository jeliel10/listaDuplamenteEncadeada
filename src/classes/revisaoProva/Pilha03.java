
package classes.revisaoProva;

public class Pilha03 {
  //  private int[] vetor;
    
    public Pilha03(){
        
    }
    
    public void imprimir(int[] vetor){
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
    public void empilhar(int num, int[] vetor){
        if(num%2 == 0){
            for(int i=0; i < vetor.length; i++){
                if(vetor[i] == 0){
                    vetor[i] = num;
            }
        }
    }
        else{
            for(int i = vetor.length; i > 0; i--){
                if(vetor[i] != 0){
                    vetor[i] = 0;
                    break;
                }
            }
        }
    }
}

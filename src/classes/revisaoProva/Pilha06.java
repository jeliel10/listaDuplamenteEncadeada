
package classes.revisaoProva;


public class Pilha06 {
    
    public Pilha06(){
        
    }
    
    public void imprimir(int[] vetor){
        for(int i=0; i < vetor.length; i++){
            System.out.println("Num - "+ vetor[i]);
        }
    }
    
    public void push(int num, int[] vetor){
        for(int i=0; i < vetor.length; i++){
            if(vetor[i] == 0){
                vetor[i] = num;
                break;
            } 
        }
    }
    
    public void pop(int[] vetor){
        for(int i=vetor.length-1; i > 0; i--){
            if(vetor[i] > 0){
                vetor[i] = 0;
                break;
            }
        }
    }
}

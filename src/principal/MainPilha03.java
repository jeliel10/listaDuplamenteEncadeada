
package principal;

import classes.revisaoProva.Pilha03;

public class MainPilha03 {
    public static void main(String[] args){
        int[] vetor = new int[6];
        
        Pilha03 p = new Pilha03();
        
        p.empilhar(2, vetor);
        p.empilhar(4, vetor);
        p.empilhar(8, vetor);
        
        p.imprimir(vetor);
        
        p.empilhar(3, vetor);
        
        p.imprimir(vetor);
    }
}

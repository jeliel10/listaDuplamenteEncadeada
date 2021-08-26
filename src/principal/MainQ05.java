
package principal;

import classes.revisaoProva.ListaDuplamenteQ05;


public class MainQ05 {
    public static void main(String[] args){
        ListaDuplamenteQ05 l = new ListaDuplamenteQ05();
        
        int[] vetor = new int[6];
        
        vetor[0] = 4;
        vetor[1] = 1;
        vetor[2] = 5;
        vetor[3] = 9;
        vetor[4] = 13;
        vetor[5] = 26;
        
        l.elementosVetor(vetor);
        
       System.out.println(l.imprimir());
    }
}

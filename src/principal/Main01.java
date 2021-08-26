
package principal;

import classes.revisaoProva.LD01;


public class Main01 {
    public static void main(String[] args){
        LD01 l = new LD01();
        
        l.empilhar(2);
        l.empilhar(4);
        l.empilhar(6);
        
        System.out.println(l.imprimir());
        
        l.empilhar(5);
        
        System.out.println(l.imprimir());
        
        System.out.println(l.imprimirTopo());
    }
}

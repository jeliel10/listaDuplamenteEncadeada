
package principal;

import classes.ListaDuplamente;
import classes.Medico;


public class Main {
    public static void main(String[]args){
        ListaDuplamente l = new ListaDuplamente();
        
        l.inserirInicio("Jeliel");
        l.inserirInicio("Ana Clara");
        l.inserirInicio("Ana Teresa");
        
        System.out.println(l.imprimir());
        l.inserirFinal("Luis Josè");
        l.inserirFinal("José");
        l.inserirFinal("Pedro Jorge");
        l.inserirInicio("Joana Maria");
        System.out.println(l.imprimir());
        l.inserirPosicao("Carlos Bonifácio", 2);
        System.out.println(l.imprimir());
        l.removerInicio();
        System.out.println(l.imprimir());
        
        l.removerFinal();
        System.out.println(l.imprimir());
        
        l.removerPosicao(2);
        System.out.println(l.imprimir());
    }
}


package principal;

import classes.revisaoProva.LD03;


public class Main03 {
    public static void main(String[] args){
        LD03 l01 = new LD03();
        LD03 l02 = new LD03();
        
        l01.inserirInicio(2);
        l01.inserirInicio(4);
        l01.inserirInicio(10);
        
        l02.inserirInicio(5);
        l02.inserirInicio(12);
        l02.inserirInicio(90);
        
        System.out.println(l01.imprimirListas(l01, l02));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.revisaoProva.Pilha06;

/**
 *
 * @author TECNOEASY
 */
public class MainPilha06 {
    public static void main(String[] args){
        int[] vetor = new int[8];
        
        Pilha06 p = new Pilha06();
        
        p.push(10, vetor);
        p.push(5, vetor);
        p.push(3, vetor);
        p.push(40, vetor);
        
        p.imprimir(vetor);
        
        p.pop(vetor);
        
        System.out.println(" ");
        p.imprimir(vetor);
        
        p.push(11, vetor);
        p.push(4, vetor);
        p.push(7,vetor);
        
        System.out.println(" ");
        p.imprimir(vetor);
        
        p.pop(vetor);
        p. pop(vetor);
        
        System.out.println(" ");
        p.imprimir(vetor);
    }
}

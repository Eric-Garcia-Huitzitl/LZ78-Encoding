/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz78;


public class Nodo {
 int indice;
 String entrada;
    Nodo(int ind,String c)
 {
 this.indice= ind; 
 this.entrada= c; 
 }
    public void showNodo(){
    System.out.println("Indice: "+indice+"  Entrada: "+entrada);
    }
 
}

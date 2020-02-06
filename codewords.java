/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz78;

/**
 *
 * @author erick cerati
 */
public class codewords {
    int num; 
    String c; 
    codewords(int n, String c){
    this.num=n;
    this.c=c; 
    }
    public void showCodeword(){
        System.out.println("<"+num+","+c+">");
    }
    /*public String getCad(){return "<"+num+","+c+">";}*/
    public String getCad(){return ""+num+c+"";}
}

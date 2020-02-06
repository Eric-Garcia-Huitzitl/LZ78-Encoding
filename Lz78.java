/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz78;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author erick cerati
 */
public class Lz78 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        leerArchivo a = new leerArchivo("C:\\Users\\erick cerati\\Documents\\NetBeansProjects\\lz78\\src\\lz78\\input.txt");
        String cad=a.convToString();
        encode(cad,16384,16); //Tamaño de Dicccionario
    }
    public static void encode(String arch,int tamDictionary,int anchoDictionary){
        LinkedList <codewords> cw = new <codewords>LinkedList();
       int indAux=0,i;
       String aux=""; 
        LinkedList <String> Biblioteca = new <String> LinkedList();
      
        for(i=0;i<arch.length();i++){
            if(Biblioteca.size()>tamDictionary){Biblioteca.clear();} // Si el tamaño del Diccionario sobrepasa se borra todo
       //Recorrer la cadena
       //Pregunto oye esta en mi biblioteca? 
       int y=0;
       if(Biblioteca.contains(Character.toString(arch.charAt(i)))==true)
       {
           aux=Character.toString(arch.charAt(i));
           y=Biblioteca.indexOf(aux);
        while(true){
            
            if(aux.length()<anchoDictionary){ i++;}else{
                System.out.println(aux);
                 String as = aux.substring(0,aux.length()-1);
                 codewords nuevo = new codewords((Biblioteca.indexOf(as)+1),Character.toString(aux.charAt(aux.length()-1)));
                 cw.add(nuevo);
                break;}
            //si esta entonces concatenalo
             aux=aux.concat(Character.toString(arch.charAt(i)));         
             if(Biblioteca.contains(aux)==false){  //Si no esta entonces lo agregamos
                 String as = aux.substring(0,aux.length()-1);
                 codewords nuevo = new codewords((Biblioteca.indexOf(as)+1),Character.toString(aux.charAt(aux.length()-1)));
                 cw.add(nuevo);
                 Biblioteca.add(aux);
                 break;}
             
        }
       }else {
       //Si no esta lo agregamos a la biblioteca
          Biblioteca.add(Character.toString(arch.charAt(i)));
          codewords nuevo = new codewords(0,Character.toString(arch.charAt(i)));
          cw.add(nuevo);
       }          
       }        
       int x=1;
       String textoCod="";
       for(int j=0;j<cw.size();j++){
          cw.get(j).showCodeword();
         textoCod= textoCod.concat(cw.get(j).getCad());
       }
       escribirArchivo a = new escribirArchivo(textoCod);
       a.escribirTexto();
      
        LinkedList <Nodo> Dictionary = new <Nodo>LinkedList();
        Nodo n;
        for(int j=0;j<Biblioteca.size();j++){
          n= new Nodo((j+1),Biblioteca.get(j));
          Dictionary.add(n);
       }
        
        for(int k=0; k<Dictionary.size();k++){
            Dictionary.get(k).showNodo();
        }
        
    }
}

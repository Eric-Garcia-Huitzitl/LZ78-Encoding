/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz78;

import java.io.*;
/**
 *
 * @author erick cerati
 */
public class escribirArchivo {
    String tex;
    escribirArchivo(String texto){
        this.tex=texto;
    }
    
    public void escribirTexto(){
    File f; 
    f = new File("C:\\Users\\erick cerati\\Documents\\NetBeansProjects\\lz78\\src\\lz78\\encode.txt");
    try{

FileWriter w = new FileWriter(f);
BufferedWriter bw = new BufferedWriter(w);
PrintWriter wr = new PrintWriter(bw);  
wr.write(tex);//escribimos en el archivo
wr.close();
bw.close();
}catch(IOException e){};

    }
    
    
}

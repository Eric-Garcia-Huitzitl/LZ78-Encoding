/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lz78;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author erick cerati
 */
public class leerArchivo {
    FileReader fr;
    //Constructor leer archivo
    leerArchivo(String nomArch) throws FileNotFoundException{
           //Abrimos archivo
            fr = new FileReader(nomArch);
    }
    
    //Métodos
   String convToString() throws IOException{
       //Convertimos un texto a un string  
      String texto = "";
      int caract = 0; 
      while(caract != -1) {
    //Hacer algo con el carácter leído
      caract = fr.read();
      texto = texto + (char)caract;
    }
      return texto; 
    }
}

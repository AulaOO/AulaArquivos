/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Guilherme
 */
public class CreatePathExemplo {
    
    public static void main(String[] args) {
     
        String filename = "arquivo_curso.txt";
        String workingDir = System.getProperty("user.dir");
        String absoluteFilePath = "";
        
        absoluteFilePath = workingDir + File.separator + filename;
        System.out.println("Caminho Final" + absoluteFilePath);
        
        File file = new File(absoluteFilePath);
        
        try {
            if(file.createNewFile()){
                System.out.println("Arquivo Criado");
            }else{
                System.out.println("Arquivo já existe");
            }
        } catch (IOException ex) {
            Logger.getLogger(CreatePathExemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

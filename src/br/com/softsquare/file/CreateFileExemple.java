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
public class CreateFileExemple {
    
    public static void main(String[] args) {
     
        File file = new File ("C:\\TesteArquiv\\SOFTSQUARE.txr");
        try {
            if(file.createNewFile()){
                System.out.println("Arquivo criado");
            }else{
                System.out.println("Arquivo já existe");
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateFileExemple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

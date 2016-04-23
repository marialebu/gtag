/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Felipe.Diaz
 */
public class Manejador {
    
    public ArrayList<Usuario> usuarios;
    public ArrayList<Usuario> informacion;
    public ArrayList<Usuario> categorias;
    
    public Manejador(){
        usuarios = new ArrayList<Usuario>();
        informacion = new ArrayList<Usuario>();
        categorias = new ArrayList<Usuario>();
        cargaDatos();
    }
    
    
    
    private void cargaDatos(){
        usuarios.add(new Usuario("Vanessa Cardozo", "vanesa.c@gmail.com", "contra123"));
        usuarios.add(new Usuario("Juliana Niño", "juli-n@gmail.com", "contra123"));
    }
    
    private void cargaInformacion() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File("Informacion.txt")));
        String linea;
        while(br.ready()){
            linea= br.readLine();
            //informacion.add(new Informacion());
        }
    }
    
    
}

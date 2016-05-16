/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Estudiante
 */
public class Servidor {
    
        public static void main(String[] args) throws IOException {
    
    ServerSocket servidor = new ServerSocket(8000); //  Asigno Puerto 
    
    
    Socket cliente = servidor.accept(); // espero conexcion
    
    InputStream entrada = cliente.getInputStream();
    OutputStream salida = cliente.getOutputStream();
    
    BufferedReader entradaCaracter = new BufferedReader(new InputStreamReader(entrada));
    
    PrintWriter salidaCaracter = new PrintWriter(salida, true);
    
    while(true){
        String recibi = entradaCaracter.readLine();
        salidaCaracter.println(recibi);
    
}
    
}
}

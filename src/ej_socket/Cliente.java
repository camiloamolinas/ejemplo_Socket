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
import java.net.Socket;

/**
 *
 * @author Estudiante
 */
public class Cliente {
       public static void main(String[] args) throws IOException {
        
        
    Socket cliente = new Socket("10.203.155.74",8000);    
           
    
    InputStream entrada = cliente.getInputStream();
    OutputStream salida = cliente.getOutputStream();
    
    BufferedReader entradaCaracter = new BufferedReader(new InputStreamReader(entrada));
    BufferedReader LecturaTeclado = new BufferedReader(new InputStreamReader(System.in));
    
    PrintWriter salidaCaracter = new PrintWriter(salida, true);
    
    while(true){
        System.out.println("Que desea enviar");
        String enviar = LecturaTeclado.readLine();
        salidaCaracter.println(enviar);
        String recibi = entradaCaracter.readLine();
        System.out.println(recibi);
    
}
    }
}

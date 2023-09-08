/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tortilla.ui;

import java.util.Scanner;
import mx.itson.tortilla.negocio.Operacion;

/**
 *
 * @author avalo
 */
public class Main {
    
    public static void main (String [] args){
        System.out.println("Escriba el enunciado a separar");
        
        Scanner scanner = new Scanner (System.in);
        
        String enunciado = scanner.nextLine();
        
        String [] resultado = new Operacion().separar(enunciado);
        
        for (String s : resultado){
            System.out.println(s);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tortilla.negocio;

/**
 * Contiene métodos para trabajar con cadenas de texto.
 * @author Icel Avalos
 */
public class Operacion {
 
    /**
     * Separar una cadena de texto en donde encuentre el caracter guion medio.
     * @param oracion Es la oración que sera separada en fracciones.
     * @return Array de String en cuyo cada componente será un fracción de la cadena otorgada.
     */
    public String[] separar (String oracion){
        // hola uwu
        String [] resultado = oracion.split("-");
        return resultado;
    }
}


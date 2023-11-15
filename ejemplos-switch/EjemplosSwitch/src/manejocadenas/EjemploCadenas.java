/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);
        /* to.Lowercase es un metodo que permite que pasemos un texto escrito en
        cualquier formato a letra minuscula */
        /* to.Uppercase tiene una funcion similar al lowercase solo que en este 
           caso hace que la letra pase a ser mayuscula */
        
    }
}

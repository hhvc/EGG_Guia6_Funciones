/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_funciones;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class Guia6_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String palabraMagica = leer.nextLine();
        
        System.out.println(validador(palabraMagica));
    }
    
    
    public static String validador (String cadenaAValidar) {
        
        String caracterValidado="";
        String cadenaValidada="";
        
        for (int i = 0; i < cadenaAValidar.length(); i++) {
            
            switch(cadenaAValidar.substring(i,i+1)){
                case "a": 
                    caracterValidado = "@";
                    break;
                case "e":
                    caracterValidado = "#";
                    break;
                case "i":
                    caracterValidado = "$";
                    break;
                case "o":
                    caracterValidado = "%";
                    break;                    
                case "u":
                    caracterValidado = "*";
                    break;           
                default:
                    caracterValidado = cadenaAValidar.substring(i,i+1);
            }
            
            cadenaValidada = cadenaValidada + caracterValidado;
            
        }
        return cadenaValidada;  
    }
    
}


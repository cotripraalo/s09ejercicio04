/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        //Mostrar mensaje al usuario
        System.out.println("Ingresa una letra: ");
        String s= input.nextLine();
        char ch = s.charAt(0);
        
        if(Character.isLetter(ch)){
            switch(Character.toUpperCase(ch)) {
                case 'A':
                case 'E':
                case 'I': 
                case 'O':  
                case 'U':
                    System.out.println(ch + " es una vocal");
                    break;
                default:
                    System.out.println(ch + " es una consonante");
                  
            }
        }else {
            System.out.println(ch + " es una entrada invalida.");
        }
    }
}

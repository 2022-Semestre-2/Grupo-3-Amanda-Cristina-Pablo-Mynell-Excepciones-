/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

/**
 *
 * @author Cristina
 */
public class EjemploTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        EJEMPLO TRY...CATCH CON EXCEPCION ARITMETICA
        */
        int numero1;
        int numero2;
    
        
        try{
    
            numero1 = 2;
            numero2 = 0;
            int resultado = numero1/numero2;
        
        }
        catch(ArithmeticException e){
        
            System.out.println("Excepcion de tipo aritmetica, no se puede dividir un numero entre 0");
    
        }
    }
    
}

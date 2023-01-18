/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Usuario
 */
public class Exception {
    public static void main(String[] args){
        try{
        new Exception().error();
<<<<<<< HEAD
        
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

    public void error(){
=======
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
    public void error() throws ArithmeticException {
>>>>>>> be2328ee7c72e217460c000c0cfd7a9df57cad13
        int i= 10/0;
        System.out.println("Imposible ="+i);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ttc46
 */
public class FinallyEj {
    public static void main(String[] args) throws IOException{
        FileWriter f = new FileWriter("filename.txt");
        try {
            
            f.write("hola");
            int numero1 = 2;
            int numero2 = 0;
            int resultado = numero1/numero2;
        } catch (IOException ex) {
            Logger.getLogger(FinallyEj.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (ArithmeticException e) {
            System.out.println("Exploto");
            //e.printStackTrace();
        } finally {
            f.close();
            System.out.println("archivo cerrado");
            System.exit(0);
        }
    }
}

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

        new Exception().error();
<<<<<<< HEAD

    }

    public void error(){
=======
>>>>>>> c5802a55aa1214fc1a4d72462df8ac711e7195a3
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
    public void error() throws ArithmeticException {
        int i= 10/0;
        System.out.println("Imposible ="+i);
    }
}


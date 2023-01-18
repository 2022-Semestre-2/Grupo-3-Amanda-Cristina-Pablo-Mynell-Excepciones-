package Exception;

public class Exception {
    public static void main(String[] args){
        try{
        new Exception().error();
        }catch(ArithmeticException e){
            System.out.println("Error: No se puede dividir entre 0");
        }finally{
            System.out.println("Terminado");
        }
    }
    public void error() throws ArithmeticException {
        int i= 10/1;
        System.out.println("Resultado ="+i);
    }
}

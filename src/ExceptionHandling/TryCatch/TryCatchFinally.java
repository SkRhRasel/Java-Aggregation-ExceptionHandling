package ExceptionHandling.TryCatch;

public class TryCatchFinally {
    public static void main(String[] args){

        try{
            String[] names = {"Rohim", "Korim", "Luna"};
            System.out.println("Name of the Student is, " + names[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: " + e);
        }finally {
            System.out.println("FInally block executed.....");
        }
        System.out.println("Moving Forward.....");
    }
}
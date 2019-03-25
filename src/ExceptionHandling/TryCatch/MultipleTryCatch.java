package ExceptionHandling.TryCatch;

public class MultipleTryCatch {
    public static void main(String[] args){

        try{

            String[] names = {"Rohim", "Korim", "Luna"};
            System.out.println("Name of the Student is, " + names[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: " + e);
        }catch (ArithmeticException e){
            System.out.println("Exception is: " + e);
        }catch (Exception e){
            System.out.println("Exception is: " + e);
        }
        System.out.println("Moving Forward.....");
    }
}

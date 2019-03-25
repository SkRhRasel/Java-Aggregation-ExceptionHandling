package ExceptionHandling.TryCatch;

public class TryCatchExample {
    public static void main(String[] args){
        try{
            String[] names = {"Rohim", "Korim", "Luna"};
            System.out.println("Name of the Student is, " + names[8]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The Exception is: "+ e);
        }
        System.out.println("Now next code will execute.....");
    }
}

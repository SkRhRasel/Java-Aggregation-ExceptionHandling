package ExceptionHandling;

public class ExceptionClass {

    public static void main(String[] args){
        int a =10;
        int b= 2;

        try{
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Your Exception will appear here: " + e);
        }

        System.out.println("Your Next code will execute from here.......");
    }
}

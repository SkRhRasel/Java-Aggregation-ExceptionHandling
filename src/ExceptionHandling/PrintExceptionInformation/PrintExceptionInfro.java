package ExceptionHandling.PrintExceptionInformation;


public class PrintExceptionInfro {

    public static void main(String[] args){
        int a=5;
        try {
            int result = a/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("Moving to next code....");
    }
}

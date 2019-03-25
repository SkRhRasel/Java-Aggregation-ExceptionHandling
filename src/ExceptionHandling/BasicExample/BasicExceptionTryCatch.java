package ExceptionHandling.BasicExample;

public class BasicExceptionTryCatch {
    public static void main(String[] args){

        int a =5;
        int b =1;

        try {
            int result = divide(a,b);
            System.out.println("Your Result is: "+result);
        }catch (Exception e){

            System.out.println("Your Exception is: "+ e);
        }
    }

    private static int divide(int a, int b) {
        return a/b;
    }


}

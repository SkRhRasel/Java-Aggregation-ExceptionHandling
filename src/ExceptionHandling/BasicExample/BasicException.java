package ExceptionHandling.BasicExample;

public class BasicException {
    public static void main(String[] args){
        int a =1;
        int b =0;

        int result = divide(a,b);
        System.out.println("Result is: "+ result);
    }

    private static int divide(int a, int b) {
        return a/b;
    }
}

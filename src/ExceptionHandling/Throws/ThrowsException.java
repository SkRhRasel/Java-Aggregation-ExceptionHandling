package ExceptionHandling.Throws;


public class ThrowsException {

    public static void main(String[] args){
        try {
            ThrowsException obj = new ThrowsException();
            obj.check_Age(15);
        }catch (Exception e){
            System.out.println("Yahooo! I handled the thrown exception here!\n" + e);
        }
        System.out.println("Moving to next code....");
    }

    private void check_Age(int i) throws Exception {
        if(i<18){
            throw new Exception("You are not a voter");
        }else{
            System.out.println("You are a voter");
        }
    }


}

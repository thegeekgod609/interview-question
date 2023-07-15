package string;

public class Demo {

    String x = "abc" + "def";

    public static void main(String[] args) {


        xyz();
    }

    private static int xyz() {

        try{
            System.out.println("1");
            throw  new Exception();
            //return 3;
        }catch (Exception e){
            System.out.println("2");
            return 1;
        }finally {
            System.out.println("3");
            return 3;
        }

    }

}

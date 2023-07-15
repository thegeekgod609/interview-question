import inheritance.Child;
import polymorphism.Fruit;
import polymorphism.Mango;

public class Main {
    public static void main(String[] args) {

         Fruit f = new Mango();
        f.func();
        //f.func1();
        //Mango m = new Fruit();
        Mango m1 = (Mango) new Fruit();



        Child c = new Child();
        //System.out.println(X.x);

    }
}
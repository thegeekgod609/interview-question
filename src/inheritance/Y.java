package inheritance;

public interface Y {

    int x = 5;

    default void fun(){
        System.out.println("Fun of Y");
    }
}

package inheritance;

public interface X {

    int x = 5;

    default void fun(){
        System.out.println("Fun of Y");
    }
}

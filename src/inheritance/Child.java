package inheritance;

import com.sun.source.tree.YieldTree;

public class Child extends Parent implements X , Y {
    @Override
    public void fun() {
        X.super.fun();
    }
}

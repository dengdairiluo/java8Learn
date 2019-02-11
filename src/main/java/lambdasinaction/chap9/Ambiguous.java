package lambdasinaction.chap9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-11 10:31
 */
public class Ambiguous {
    public static void main(String... args) {
        new C().hello();
    }

    static interface A{
        public default void hello() {
            System.out.println("Hello from A");
        }
    }

    static interface B {
        public default void hello() {
            System.out.println("Hello from B");
        }
    }

    static class C implements B, A {
        @Override
        public void hello(){
            A.super.hello();
        }
    }
}

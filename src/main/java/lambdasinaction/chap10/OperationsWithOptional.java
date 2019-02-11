package lambdasinaction.chap10;

import java.util.*;

import static java.util.Optional.empty;
import static java.util.Optional.of;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-11 23:35
 */
public class OperationsWithOptional {

    public static void main(String... args) {
        System.out.println(max(of(3), of(5)));
        System.out.println(max(empty(), of(5)));

        Optional<Integer> opt1 = of(5);
//        Optional<Integerteger> opt2 = opt1.or(() -> of(4));
//
//        System.out.println(
//                of(5).or(() -> of(4))
//                          );
    }

    public static final Optional<Integer> max(Optional<Integer> i, Optional<Integer> j) {
        return i.flatMap(a -> j.map(b -> Math.max(a, b)));
    }
}

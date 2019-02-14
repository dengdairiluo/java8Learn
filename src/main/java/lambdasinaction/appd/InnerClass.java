package lambdasinaction.appd;

import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-14 17:31
 */
public class InnerClass {

    Function<Object, String> f = new Function<Object, String>() {
        @Override
        public String apply(Object o) {
            return o.toString();
        }
    };
}

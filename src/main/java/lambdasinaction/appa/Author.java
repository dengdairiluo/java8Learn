package lambdasinaction.appa;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-14 16:57
 */
@Repeatable(Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}

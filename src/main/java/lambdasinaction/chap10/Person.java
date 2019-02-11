package lambdasinaction.chap10;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-11 23:32
 */
public class Person {

    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }
}

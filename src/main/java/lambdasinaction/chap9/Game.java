package lambdasinaction.chap9;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-10 23:16
 */
public class Game {
    public static void main(String[] args) {
        List<Resizable> resizableShapes =
                Arrays.asList(new Square(),
                        new Triangle(), new Ellipse());
        Utils.paint(resizableShapes);

    }
}

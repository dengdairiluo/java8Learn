package lambdasinaction.appa;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-14 17:00
 */
@Author(name = "Raoul")
@Author(name = "Mario")
@Author(name = "Alan")
public class Book {

    public static void main(String[] args) {
        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        Arrays.asList(authors).stream().forEach(a -> {
            System.out.println(a.name());
        });
    }

}

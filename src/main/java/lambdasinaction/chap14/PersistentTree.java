package lambdasinaction.chap14;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-14 15:14
 */
public class PersistentTree {

    public static void main(String[] args) {
        Tree t = new Tree("Mary", 22,
                new Tree("Emily", 20,
                        new Tree("Alan", 50, null, null),
                        new Tree("Georgie", 23, null, null)
                ),
                new Tree("Tian", 29,
                        new Tree("Raoul", 23, null, null),
                        null
                )
        );

        // found = 23
        System.out.println(lookup("Raoul", -1, t));
        // not found = -1
        System.out.println(lookup("Jeff", -1, t));

        Tree f = fupdate("Jeff", 80, t);
        // found = 80
        System.out.println(lookup("Jeff", -1, f));

        Tree u = update("Jim", 40, t);
        // t was not altered by fupdate, so Jeff is not found = -1
        System.out.println(lookup("Jeff", -1, u));
        // found = 40
        System.out.println(lookup("Jim", -1, u));

        Tree f2 = fupdate("Jeff", 80, t);
        // found = 80
        System.out.println(lookup("Jeff", -1, f2));
        // f2 built from t altered by update() above, so Jim is still present = 40
        System.out.println(lookup("Jim", -1, f2));
    }

    public static int lookup(String k, int defaultVal, Tree t) {
        if (null == t) {
            return defaultVal;
        }
        if (k.equals(t.key)) {
            return t.val;
        }

        return lookup(k, defaultVal, k.compareTo(t.key) < 0 ? t.left : t.right);
    }

    public static Tree update(String k, int newVal, Tree t) {
        if (null == t) {
            t = new Tree(k, newVal, null, null);
        } else if (k.equals(t.key)) {
            t.val = newVal;
        } else if (k.compareTo(t.key) < 0) {
            t.left = update(k, newVal, t.left);
        } else {
            t.right = update(k, newVal, t.right);
        }
        return t;
    }

    public static Tree fupdate(String k, int newVal, Tree t) {
        return (t == null) ?
                new Tree(k, newVal, null, null) :
                k.equals(t.key) ?
                        new Tree(k, newVal, t.left, t.right) :
                        k.compareTo(t.key) < 0 ?
                                new Tree(t.key, t.val, fupdate(k, newVal, t.left), t.right) :
                                new Tree(t.key, t.val, t.left, fupdate(k, newVal, t.right));
    }

    static class Tree {
        private String key;
        private int val;
        private Tree left, right;

        public Tree(String k, int v, Tree l, Tree r) {
            this.key = k;
            this.val = v;
            this.left = l;
            this.right = r;
        }
    }
}

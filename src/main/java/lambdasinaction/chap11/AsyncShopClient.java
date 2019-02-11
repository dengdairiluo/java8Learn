package lambdasinaction.chap11;

import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-02-12 01:15
 */
public class AsyncShopClient {

    public static void main(String[] args) {
        AsyncShop shop = new AsyncShop("BestShop");
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPrice("myPhone");
        long incocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Invocation returned after " + incocationTime + " msecs");
        try {
            System.out.println("Price is " + futurePrice.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long retrivalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Price returned after " + retrivalTime + " msecs");
    }
}

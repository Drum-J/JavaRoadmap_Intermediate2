package collection.map.test2.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Product, Integer> cartMap = new HashMap<>();

    // 코드 작성
    public void add(Product product, int quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        if (!cartMap.containsKey(product)) {
            System.out.println("Error! 해당 상품은 장바구니에 들어있지 않습니다. " + product);
            return;
        }

        Integer currentQuantity = cartMap.get(product);
        if (currentQuantity - quantity < 1) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, currentQuantity - quantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}

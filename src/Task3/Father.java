package Task3;

import java.util.HashMap;
import java.util.Map;

public class Father {
    public static String get;
    private String fatherName;
    private int money;
    private final Map<ProductEmums, Integer> shoppingList = new HashMap<>();

    public Father(String fatherName, int money) {
        this.fatherName = fatherName;
        this.money = money;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void makeShop(Shop shop) {
        int totalPrice = 0;
        for (Map.Entry<ProductEmums, Integer> entry : shoppingList.entrySet()) {
            ProductEmums product = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += shop.getPriceProduct() * quantity;
        }
        if (totalPrice > money) {
            throw new IllegalArgumentException("Недостатньо коштів");
        }


   /* void shoppingList(ProductEmums.BEER) || void shoppingList(ProductEmums.TABACCO) {
        throw new IllegalArgumentException("чи купляє батько пиво та табак");*/

        for (int quantity : shoppingList.values()) {
            if (quantity % 3 != 0) {
                throw new IllegalArgumentException("не можна купляти більше ніж три вида товарів");
            }
        }
    }


    public void makeShop(ProductEmums productEmums) {

    }
}




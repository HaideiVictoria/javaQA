package Task3;

import java.util.Map;

public class Shop {
    private String typeProduct;
    private int priceProduct;




    public Shop() {

    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }
    public static void map(Map<ProductEmums,Integer>map){
        map.put(ProductEmums.APPLE,100);
        map.put(ProductEmums.POTATO,50);
        map.put(ProductEmums.MILK,75);
        map.put(ProductEmums.BEER,125);
        map.put(ProductEmums.TABACCO,200);

    }


    private int getProductPrice(ProductEmums productEmums){
        switch (productEmums) {
            case APPLE:
                return 25;
                case POTATO:
                return 20;
                case MILK:
                return 35;
                case BEER:
                return 40;
                case TABACCO:
                return 45;
                default:
                throw new IllegalStateException("Unexpected value: " + productEmums);
        }
    }}

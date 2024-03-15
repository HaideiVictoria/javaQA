package Task1;

public class Shopping {
    private String productName;
    private  double cost;
    private  boolean containsAlcohol;

    public Shopping(String productName, double cost, boolean containsAlcohol) {
        this.productName = productName;
        this.cost = cost;
        this.containsAlcohol = containsAlcohol;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isContainsAlcohol() {
        return containsAlcohol;
    }

    public void setContainsAlcohol(boolean containsAlcohol) {
        this.containsAlcohol = containsAlcohol;
    }

}

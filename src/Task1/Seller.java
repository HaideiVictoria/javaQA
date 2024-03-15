package Task1;

public class Seller {
    private static boolean isHonest;
    private String nameSeller;
    private boolean honest;


    public Seller(String nameSeller, boolean honest) {
        this.nameSeller = nameSeller;
        this.honest = honest;
    }

    public String getNameSeller() {
        return nameSeller;
    }

    public void setNameSeller(String nameSeller) {
        this.nameSeller = nameSeller;
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public boolean sell (boolean isAlcoholic) {
        if (isHonest && isAlcoholic) {
            return false; //
        } else if (!isHonest && isAlcoholic) {
            return true; //
        }
        return true;


    }
}

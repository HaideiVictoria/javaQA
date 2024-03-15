package Task1;

public class Buyer {
    private String nameBuyer;
    private boolean discountCard;
    private int age;


    public Buyer(String nameBuyer, boolean discountCard, int age) {
        this.nameBuyer = nameBuyer;
        this.discountCard = discountCard;
        this.age = age;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }

    public boolean isDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(boolean discountCard) {
        this.discountCard = discountCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}

public class Product {
    private String name;
    private double price;

    /*Getters and Setter */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    /*Metods*/

    public void applyDiscount(double percentDiscount ){
        double percent = 1 - (percentDiscount /100);
        this.price *= percent;
        System.out.println("Value with disccount apply: " + this.getPrice());
    }


}

package hw4;

public class Order {

    private Customer customer;
    private Product product;
    private int amout;
    private float price;

    public Order(Customer customer, Product product, int amout, float price) {
        this.customer = customer;
        this.product = product;
        this.amout = amout;
        this.price = price;

    }

    public Order(Customer customer2, Product product2, int amout2) {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    

}

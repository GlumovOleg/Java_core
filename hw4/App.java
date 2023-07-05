package hw4;



public class App {

    static Customer[] customers = null;
    static Product[] products = null;

    public static void main(String[] args) {

        customers = new Customer[] {
                new Customer("Ivan", "Ivanov", "+79516254872", 26, "male"),
                new Customer("Stepan", "Ulich", "+79662585481", 26, "male"),
                new Customer("Elena", "Popova", "+79515466528", 29, "famale"),
                new Customer("Oleg", "Petrov", "+79612584381", 35, "male") };

        products = new Product[] {
                new Product("Milk", 80.3f),
                new Product("Bread", 45.5f),
                new Product("Meat", 600),
                new Product("Tea", 80.6f),
                new Product("Coffe", 380.2f),
                new Product("Chocolate", 65)
        };

        Order[] orders = new Order[5];

        String[] phones = { "+79516254872", "+79612584381", "+79662585481", "+79612584381", "+79516254872" };
        String[] productsTitle = { "Milk", "Bread", "Meat", "Water", "Tea" };
        int[] amout = { 4, 0, 7, 102, -1 };

        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            try {
                orders[i] = makePurchase(phones[i], productsTitle[i], amout[i]);
                count++;
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                orders[i] = makePurchase(phones[i], productsTitle[i], 1);
                System.out.println("Изменили на 1");
                count++;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Количество совершенных покупок: " + count);
    }

    public static Order makePurchase(String phone, String title, int amout)
            throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        Product product = null;

        for (Customer c : customers) {
            if (c.getPhone().equals(phone)) {
                customer = c;
            }
        }

        for (Product p : products) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }

        if (customer == null) {
            throw new CustomerException("Customer is not found");
        }
        if (product == null) {
            throw new ProductException("Product is not found");
        }

        if ((amout > 100) || (amout < 1)) {
            throw new AmountException("Is not right amount");
        }

        return new Order(customer, product, amout);
    }

}
package Constructor1;

public class Order {
    private int orderId;
    private Product product;

    private int quantity;

    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public String getOrderInfo(){
        return "Order ID : " + orderId + ", " + product.getInfo()+ " Quantity : " + quantity;
    }

    public static void main(String[] args) {

        Product product = new Product("Labtop" , 999.99);

        Order order = new Order(123,product,2);

        System.out.println(order.getOrderInfo());
    }
}

package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder po1 = new ProductOrder();
        po1.productName = "RAM";
        po1.price = 250000;
        po1.quantity = 2;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "5060 그래픽카드";
        po2.price = 460000;
        po2.quantity = 1;

        ProductOrder[] productOrders = {po1, po2};

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + " 주문금액: " + productOrder.price + "*" + productOrder.quantity + "=" + productOrder.price * productOrder.quantity);
        }
    }
}

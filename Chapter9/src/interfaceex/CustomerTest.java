package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        //buy, sell에 customer를 대입해도 customer에 재정의한 order가 호출된다.
    }
}

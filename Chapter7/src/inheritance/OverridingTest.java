package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000)+ "원 입니다.");
        /*
        customerNo의 자료형은 Customer 클래스이지만 calcPrice 메서드를 호출 했을 때 불린 메서드는 VIPCustomer의 오버라이딩된 메서드가 호출 되었다.
        자바에서는 항상 인스턴스의 메서드가 호출된다. 이를 "가상함수" 라고 한다.

        함수는 메서드보다 큰 개념이다.
        메서드의 이름은 컴파일 되면 그 이름 자체가 주소가 된다.
        calcPrice는 재정의되었기 때문에 메서드의 주소는 Customer와 VIPCustomer가 다른 값을 갖게 된다.
        */

    }
}

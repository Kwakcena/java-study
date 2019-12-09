package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        /*
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
         */

        //상위 클래스로의 묵시적 형 변환
        /*
        상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성할 수 있다.
        하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형 변환이 가능하다.
        상속관계에서 모든 하위 클래스는 상위클래스로 묵시적 형변환이 된다.
        그 역은 성립하지 않는다.
         */
        Customer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}

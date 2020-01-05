package polymorphism;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    /*
    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.5;
        salesRatio = 0.1;

        System.out.println("VIPCustomer()생성자 호출");
    }

     */

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        //System.out.println("VIPCustomer(int, String)생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        /*
        오버로딩 : 메서드 이름은 같지만 매개변수의 개수, 내용이 다른 경우.
        오버라이딩 : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
                  하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있다.
         */

        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}

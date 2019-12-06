package inheritance;

public class Customer {

    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    //기본 생성자.
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    //얼마를 지불해야 하는지 계산.
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    //회원 정보 출력
    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }


}

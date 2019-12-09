package inheritance;

public class VIPCustomer extends Customer{

    double salesRatio;
    private int agentID;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.5;
        salesRatio = 0.1;

        System.out.println("VIPCustomer()생성자 호출");
    }
}

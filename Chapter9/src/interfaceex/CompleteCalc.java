package interfaceex;

public class CompleteCalc extends Calculater {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0) return ERROR;
        else return num1 / num2;
    }

    //디폴트 메서드는 재정의하여 클래스의 메서드로 불리게 할 수 있습니다.
    /*
    @Override
    public void description() {
        System.out.println("재정의 한 description");
    }
     */

    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }

}

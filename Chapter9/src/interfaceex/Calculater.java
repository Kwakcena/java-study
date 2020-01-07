package interfaceex;

//모든 추상 메서드를 구현하지 않으면 abstract 키워드가 들어가게 된다.
public abstract class Calculater implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

}

package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() { }

    //아래의 시나리오는 변하면 안되기 때문에 하위클래스에서 재정의 하지 못하도록 final 키워드를 붙인다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}

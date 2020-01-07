package interfaceex;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    //두개의 인터페이스를 받았을 때 defalut 메서드가 중복되면 어느 인터페이스의 기본 메서드를 사용할건지 명시해야 한다.
    //아니면 재정의하여 사용해야 한다.

    @Override
    public void order() {
        System.out.println("customer order");
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}

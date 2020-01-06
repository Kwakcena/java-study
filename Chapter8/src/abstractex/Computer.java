package abstractex;

/*
추상 클래스는 단독으로 쓸려고 하는게 아닌 상위 클래스용으로 자주 사용된다.
예를들어 컴퓨터의 종류가 여러개 있지만 전원을 켜고 끄는것은 공통이다.
하지만 display나 typing은 매 컴퓨터마다 다르기 때문에 추상 메서드로 명시해놓으면 하위에서 이를 구현하는 것이다.
 */

//추상 메서드 명시는 추상 클래스에서 가능하다.
public abstract class Computer {

    //추상 메서드로 명시한다.
    //구현의 책임을 하위 클래스에 위임한다.
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}

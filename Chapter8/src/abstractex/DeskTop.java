package abstractex;

/*
Computer 클래스의 display나 typing 둘 중 하나만 구현한다고 하면 아직 abstract 메서드가 남아있기 때문에
DeskTop 클래스도 abstract 키워드가 들어가야 한다.

public abstract class DeskTop extends Computer
 */
public class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    //하위 클래스가 공통으로 사용하는 기능의 메서드인 turnOff지만 하위 클래스에 따라 재정의할수 있다.
    @Override
    public void turnOff() {
        System.out.println("desktop turnoff");
    }
}

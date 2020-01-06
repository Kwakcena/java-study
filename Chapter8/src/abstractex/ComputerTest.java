package abstractex;

public class ComputerTest {

    public static void main(String[] args) {
        //Computer는 추상 클래스이므로 new가 불가능하다.
        //Computer computer = new Computer();

        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();
    }
}

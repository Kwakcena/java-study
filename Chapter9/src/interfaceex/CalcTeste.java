package interfaceex;

public class CalcTeste {

    public static void main(String[] args) {

        Calc calc = new CompleteCalc();
        /*
        인터페이스를 구현한 클래스는 인터페이스 타입으로 변수를 선언하여 인스턴스를 생성 할 수 있다.
        인터페이스는 구현 코드가 없기 때문에 타입 상속이라고도 한다.
         */
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo();

        /*
        하나의 인터페이스를 여러 클래스가 구현함.
        사용자는 구현 코드랑 상관없이 명세만 보고 사용하게 되는데, 이것이 인터페이스의 중요한 역할이다.
         */
    }
}

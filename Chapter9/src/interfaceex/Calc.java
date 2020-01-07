package interfaceex;

public interface Calc {

    //프리 컴파일 단계에서 상수로 바뀐다.
    double PI = 3.14;
    int ERROR = -999999999;

    //
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    //여러 클래스에서 공통적으로 쓰이는 디폴트 메서드입니다.
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    //static으로 정의해서 인터페이스의 타입으로 사용가능한 정적메서드입니다.
    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    //인터페이스 내부에서 사용하는 메서드입니다. java9 부터 제공됩니다.
    private void myMethod() {
        System.out.println("private method");
    }

    //static method 에서 사용하는 메서드 입니다.
    private static void myStaticMethod() {
        System.out.println("private static method");
    }
}

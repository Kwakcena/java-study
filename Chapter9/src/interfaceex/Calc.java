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

}

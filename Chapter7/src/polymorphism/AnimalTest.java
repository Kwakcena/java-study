package polymorphism;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    //오버라이딩.
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger extends Animal {
    //오버라이딩.
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal {
    //오버라이딩.
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args)
    {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
    }

    //하나의 코드가 여러 자료형으로 구현되어 다른 실행이 되는 것. 다형성.
    public void moveAnimal(Animal animal) {
       animal.move();
    }

    /* 원래는 아래와 같이 오버로딩 해서 자료형에 맞게 따로 구현해야 함.
    public void moveAnimal(Human animal) {
        animal.move();
    }

    public void moveAnimal(Tiger animal) {
        animal.move();
    }

    public void moveAnimal(Eagle animal) {
        animal.move();
    }
     */

}


package polymorphism;

import java.util.ArrayList;

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

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    //오버라이딩.
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    //오버라이딩.
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args)
    {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);


    }

    public void testDownCasting(ArrayList<Animal> list) {
        //Animal 자료형인 hAnimal은 readBooks를 사용할 수 없다.
        //따라서 다운 캐스팅을 해야 한다.
        //hAnimal의 인스턴스가 Human인지를 True, false로 반환함.
        for(int i=0; i<list.size(); i++) {
            Animal animal = list.get(i);
            if(animal instanceof Human) {
                Human human = (Human)animal;
                human.readBooks();
            }
            else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle) {
               Eagle eagle = (Eagle)animal;
               eagle.flying();
            }
            else {
                System.out.println("error");
            }

        }
    }

    //하나의 코드가 여러 자료형으로 구현되어 다른 실행이 되는 것. 다형성.
    public void moveAnimal(Animal animal) {
       animal.move();
    }
}


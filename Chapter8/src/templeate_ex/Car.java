package templeate_ex;

public abstract class Car {

    protected String carName;

    public abstract void start();
    public abstract void dirve();
    public abstract void stop();
    public abstract void turnOff();

    final public void run() {
        start();
        dirve();
        stop();
        turnOff();
    }

}

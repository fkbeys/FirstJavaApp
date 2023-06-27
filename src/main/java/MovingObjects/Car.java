package MovingObjects;

public class Car {
    private String name;
    private int age;
    private Object lock1 = new Object();
//    private Object lock2 = new Object();

    public void readAge() {
        System.out.println(age);
    }

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void yaz1() {

        int localAge = 0;
        for (int k = 0; k < 200; k++) {
            localAge++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        synchronized (lock1) {
            age += localAge;
        }
    }

    public void yaz2() {
        int localAge = 0;
        for (int k = 0; k < 200; k++) {
            localAge++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        synchronized (lock1) {
            age += localAge;
        }
    }
}

package MovingObjects;

public class Plane implements Runnable {

    private String name;
    private int id;

    public Plane(String name, int age) {
        this.name = name;
        this.id = age;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker:" + name + " T.Id:" + id + " Started");
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("error on threadsleep");
        }
        System.out.println("Worker:" + name + " T.Id:" + id + " Finished");
    }
}

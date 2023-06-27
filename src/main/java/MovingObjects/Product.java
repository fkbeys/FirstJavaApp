package MovingObjects;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Product {

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

//    ArrayList<Integer> intList = new ArrayList<>(10);

    public void Produce() {
        while (true) {
            var rnd = new Random().nextInt(100);
            try {
                Thread.sleep(300);
               queue.put(rnd);
         //       intList.add(rnd);
            } catch (InterruptedException e) {
                System.out.println("error on produce");
            }

            System.out.println(rnd + ": added to queue...");
        }
    }

    public void Consume() {

        while (true) {
            try {
                Thread.sleep(1000);
            //  var number=queue.take();
         //       var number = intList.get(0);
            //    intList.remove(0);

               // System.out.println(number + ": readed from the queue. Size:"+queue.size());
                System.out.println("Size:"+queue.size());
            } catch (InterruptedException e) {
                System.out.println("Error on read...");
            }
        }

    }


}

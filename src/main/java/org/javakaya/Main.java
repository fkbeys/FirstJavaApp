package org.javakaya;

import MovingObjects.Car;
import MovingObjects.Plane;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        long baslangic = System.currentTimeMillis();

        Thread t1 = new Thread(new Plane("1", 1));
        Thread t2 = new Thread(new Plane("2", 2));
        Thread t3 = new Thread(new Plane("3", 3));
        Thread t4 = new Thread(new Plane("4", 4));
        Thread t5 = new Thread(new Plane("5", 5));

        ExecutorService exs = Executors.newFixedThreadPool(2);
        exs.submit(t1);
        exs.submit(t2);
        exs.submit(t3);


        exs.submit(t4);
        exs.submit(t5);

        exs.shutdown();
        exs.awaitTermination(1, TimeUnit.DAYS);

        long bitis = System.currentTimeMillis();
        System.out.println("Fark milisecond:" + String.valueOf(bitis - baslangic));


    }


}
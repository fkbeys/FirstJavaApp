package org.javakaya;

import MovingObjects.Product;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        long baslangic = System.currentTimeMillis();

        Product prd = new Product();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                prd.Produce();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                prd.Consume();
            }
        });

        t1.start();
        t2.start();


        long bitis = System.currentTimeMillis();

        System.out.println("Fark milisecond:" + String.valueOf(bitis - baslangic));


    }


}
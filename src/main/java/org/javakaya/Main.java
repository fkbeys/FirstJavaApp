package org.javakaya;

import MovingObjects.Car;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car arac1 = new Car("a", 0);


        long baslangic=System.currentTimeMillis();
//        Runnable rn1 = new Runnable() { @Override public void run() {arac1.yaz1();}};
//        Runnable rn2 = new Runnable() {@Override public void run() {arac1.yaz2();}};
//        Thread t1 = new Thread(rn1);
//        Thread t2 = new Thread(rn2);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//
//        arac1.readAge();

         arac1.yaz1();
         arac1.yaz2();


        long bitis=System.currentTimeMillis();

        System.out.println("Fark milisecond:" + String.valueOf(bitis-baslangic) );


    }


}
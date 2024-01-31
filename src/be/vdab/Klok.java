package be.vdab;

import java.time.LocalTime;

public class Klok implements Runnable{
    @Override
    public void run() {
        boolean verderDoen = true;
        while (verderDoen) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
                verderDoen = false;
            }
        }
    }
}

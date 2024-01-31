import be.vdab.InsectenLezer;
import be.vdab.Klok;
import be.vdab.Kok;
import be.vdab.Stapel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*INSECTLEZER*/

        /*InsectenLezer lezer1 = new InsectenLezer("/Users/joann/data/insecten1.csv", System.out);
        InsectenLezer lezer2 = new InsectenLezer("/Users/joann/data/insecten2.csv", System.err);

        Thread thread1 = new Thread(lezer1);
        Thread thread2 = new Thread(lezer2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");
        */

        /*KLOK*/

        /*Klok klok = new Klok();
        Thread thread = new Thread(klok);
        thread.setDaemon(true);
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();*/

        /*PANNENKOEKEN*/

        Stapel stapel = new Stapel();
        var thread1 = Thread.startVirtualThread(new Kok(stapel));
        var thread2 = Thread.startVirtualThread(new Kok(stapel));



        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(stapel.getAantalPannenkoeken());
    }
}

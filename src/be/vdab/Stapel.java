package be.vdab;

import java.util.concurrent.atomic.AtomicInteger;

public class Stapel {

    private final AtomicInteger aantalPannenkoeken = new AtomicInteger();

    public void voegPannenKoekToe() {
        aantalPannenkoeken.incrementAndGet();
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken.intValue();
    }
}

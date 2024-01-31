package be.vdab;

public class Kok implements Runnable{

    private final Stapel stapel;

    public Kok(Stapel stapel) {
        this.stapel = stapel;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            stapel.voegPannenKoekToe();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }
    }
}

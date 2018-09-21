
import java.util.ArrayList;

public class Run {
    private static int nRenas = 9;
    private static int nElfos = 10;

    public static void main(String[] args) {
        PapaiNoel papai = new PapaiNoel();

        ArrayList<Thread> renas = new ArrayList<Thread>();
        ArrayList<Thread> elfo = new ArrayList<Thread>();

        for (int i = 0; i < nElfos; ++i) {
            elfo.add(new Thread(new Elfo(i, papai)));
        }
        for (int i = 0; i < nRenas; ++i) {
            renas.add(new Thread(new Rena(i, papai)));
        }

        for (Thread t : elfo) {
            t.start();
        }
        for (Thread t : renas) {
            t.start();
        }
    }
}

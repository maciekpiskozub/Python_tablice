import java.util.Random;

public class Tablica {
    private int[] tablica;

    public Tablica(int N) {
        tablica = new int[N];
    }
    public void wypelnij(int a, int b) {
        Random rand = new Random();
        for(int i = 0; i<tablica.length; i++) {
            tablica[i] = rand.nextInt(b - a + 1) + a;
        }
    }

    public int maksimum() {
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

    public int minimum() {
        int min = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }

    // drugie maksimum mnie poskladalo


    public int znajdz(int a) {
        for(int i = 0; i < tablica.length; i++) {
            if(tablica[i]==a) {
                return i;
            }
        }
        return -1;
    }


}

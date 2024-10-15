import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica(5);
        tablica.wypelnij(1,50);


        System.out.println("Maksimum:" + tablica.maksimum());
        System.out.println("Minimum:" + tablica.minimum());
        System.out.println("szukamy index a:" + tablica.znajdz(30));
    }
}
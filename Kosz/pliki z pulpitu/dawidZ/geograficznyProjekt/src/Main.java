public class Main {
    // argumenty resztowe
    public static void main(String[] args) {
//        System.out.printf("imie: %s, wiek: %d", "Przemek", 27);
        System.out.println(mojaKlasa.mojNapis(1, "dsadada", "sada", "asdwda"));
        System.out.println(mojaKlasa.sumLiczba(1,2,3,4,5,6,7,8,9,10));
        System.out.println(mojaKlasa.maxLiczba(1,8,2, 10));
    }
}
//max
class mojaKlasa{
    public static String mojNapis(int liczba, String... fragmenty){ // argument resztowy musi być ostatni, trzy kropki oznaczają agrument resztowy. Argumenty resztowe to tablica
        return String.join(", ", fragmenty);
    }
    public static  int sumLiczba(int... liczby){
        int sum = 0;
        for (int l: liczby) {
            sum += l;
        }
        return sum;
    }
    public static  int maxLiczba(int... liczby){
        int max = 0;
        for (int l: liczby) {
                if (max<l){
                    max = l;
                }
        }
        return max;
    }
}

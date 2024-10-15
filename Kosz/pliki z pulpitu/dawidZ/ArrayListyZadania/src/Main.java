import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Napisz program który utowrzy array liste doda do niej jakieś kolory(string) i wypisze kolekcje przy pomocy foreach*/
        //ArrayList<color> kolory = new ArrayList<>();
        var kolory = new ArrayList<String>();
        kolory.add("czerwony");
        kolory.add("zielony");
        kolory.add("niebieski");


        //kolory.add(new color("czerwony"));
        //kolory.add(new color("zielony"));
        //kolory.add(new color("niebieski"));
        System.out.println("Napisz program który utowrzy array liste doda do niej jakieś kolory(string) i wypisze");
        for (var kolor: kolory) {
            System.out.println(kolor);
        }
        System.out.println();
        System.out.println("zadanie 2");
        /*
        Przeliteruj po utrorzonej powyżej arrayLiście bez użycia foreach, wypisująć jego elementy
        */
        System.out.println("Przeliteruj po utrorzonej powyżej arrayLiście bez użycia foreach, wypisująć jego elementy");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        System.out.println();
        System.out.println("zadanie 3");
        /*
        Dodaj element na początku array listy
        */
        System.out.println("Dodaj element na początku array listy");
        System.out.println("Przed:");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        kolory.addFirst("różowy");
        System.out.println("Po:");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        System.out.println();
        System.out.println("zadanie 4");
        /*
        Wyczytaj wybrany konkretnie element arrayListy
        */
        System.out.println("Wyczytaj wybrany konkretnie element arrayListy");
        System.out.println(kolory.get(2));
        System.out.println();
        System.out.println("zadanie 5");
        /*
        Zmie wybrany powyżej element na inny
        */
        System.out.println("Zmie wybrany powyżej element na inny");
        System.out.println("Przed:");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        kolory.set(2, "czarny");
        System.out.println("Po:");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        System.out.println();
        System.out.println("zadanie 6");
        /*usuń kolor 2*/
        System.out.println("usuń kolor 2");
        System.out.println("Przed:");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        kolory.remove(2);
        System.out.println("Po:");
        for (int i = 0; i < kolory.size(); i++) {
            System.out.println(kolory.get(i));
        }
        System.out.println();
        System.out.println("zadanie 7");
        /*Spradź czay w array liście jest niebieski*/
        System.out.println("Spradź czay w array liście jest niebieski");
        if (kolory.contains("niebieski")){
            System.out.println("jest niebieski");
        }else{
            System.out.println("niema niebieskiego");
        }
        System.out.println();
        System.out.println("zadanie 8");
        /*Posoryuj listę kolorów. wypisz ją przed i po sortowaniu*/
        System.out.println("Posoryuj listę kolorów");
        System.out.println("Przed:");
        for (var k: kolory) {
            System.out.println(k + ", ");
        }
        System.out.println("Po:");
        Collections.sort(kolory);
        for (var k: kolory) {
            System.out.print(k + ", ");
        }
        System.out.println();
        System.out.println("zadanie 9");
        /*Skopiuj listę do drubiej*/
        System.out.println("Skopiuj listę do drubiej");
        System.out.println("Lista 1:");
        for (var k: kolory) {
            System.out.println(k + ", ");
        }
//        ArrayList<String> kopia_kolory = (ArrayList<String>) kolory.clone();
        ArrayList<String> kopia_kolory = new ArrayList<>();
        Collections.copy(kolory, kopia_kolory);
        System.out.println("lista 2:");
        for (var k: kopia_kolory) {
            System.out.println(k + ", ");
        }
        System.out.println("zadanie 10");
        // używając Collecrions polosuj kolory, czyli zmień kolejność losową (shuffle)
        System.out.println("używając Collecrions polosuj kolory, czyli zmień kolejność losową (shuffle)");
        System.out.println("Przed:");
        for (var k: kolory) {
            System.out.println(k + ", ");
        }
        Collections.shuffle(kolory);
        System.out.println("Po:");
        for (var k: kolory) {
            System.out.println(k + ", ");
        }
        System.out.println();

        System.out.println("zadanie 11");
        // odwróć kolejność kolorów w kolekcji
        System.out.println("odwróć kolejność kolorów w kolekcji");
        System.out.println("Przed:");
        for (var k: kolory) {
            System.out.println(k + ", ");
        }
        Collections.reverse(kolory);
        System.out.println("Po:");
        for (var k: kolory) {
            System.out.println(k + ", ");
        }
        System.out.println();
        System.out.println("zadanie 11 3/4");
        //do każdej operacji powyżel dodaj wypisanie na konsole informacji, co jest wykonywane, efektu przed, efektu po oraz pustej lini
        System.out.println("do każdej operacji powyżel dodaj wypisanie na konsole informacji, co jest wykonywane, efektu przed, efektu po oraz pustej lini");

    }

}/*class color{
    String kolor;

    public color(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "color = " + kolor;
    }
}*/
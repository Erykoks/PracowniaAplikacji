import static java.lang.IO.print;

void main() {
    print("Ania ");
    print("Bartek ");
    print("Kasia");


    //zad2
    public class Zad2 {
        public static void main(String[] args) {

            String imie = "Eryk";
            int rokUrodzenia = 2008;
            double liczba = 0.66;

        }
    }

    //zad3
    public class Zad3 {
        public static void main(String[] args) {

            String imie = "Eryk";
            int rokUrodzenia = 2008;
            double liczba = 0.66;

            System.out.println("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

        }
    }

    //zad4
    import java.util.Scanner;

    public class Zad4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double stopnie;

            System.out.println("Podaj temperature w stopniach Celsjusza:");
            stopnie = scanner.nextDouble();

            double fahrenheit = 1.8 * stopnie + 32.0;

            System.out.println("Temperatura w Fahrenheitach wynosi: " + fahrenheit);

        }
    }

}
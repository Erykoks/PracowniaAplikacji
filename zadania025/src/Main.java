import java.util.Scanner;

void main() {

    //zad1
    Scanner sc = new Scanner(System.in);

    //1
    System.out.print("Podaj liczbe: ");
    int liczba = sc.nextInt();

    if (liczba % 3 == 0) {
        System.out.println("Twoja liczba jest podzielna przez 3");
    } else {
        System.out.println("Twoja liczba nie jest podzielna przez 3");
    }

}
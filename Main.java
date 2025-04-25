import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Zad jeden
    public static void main(String[] args) {
        String imie = "Yevhen";
        double cena = 20;
        int ilosc = 2;


        // Zad 2
        System.out.print("Zad 2, liczba: ");
        Scanner scanner = new Scanner(System.in);
        int dana_liczba = scanner.nextInt();
        if (dana_liczba % 2 == 0) {
            System.out.println("Ta liczba jest parzysta");
        } else {
            System.out.println("Ta liczba nie jest parzysta");
        }

        //Zad trzy
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Zad 4
        int a = 5;
        while (a <= 15) {
            System.out.println(a);
            a++;
        }

        //Zad5
        ArrayList<Integer> liczby = new ArrayList<>();

        liczby.add(234);
        liczby.add(25);
        liczby.add(36);
        liczby.add(92);
        liczby.add(199);

        for (int liczba : liczby) {
            System.out.println(liczba);
        }

    }
}
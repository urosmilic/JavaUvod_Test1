import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2. Napraviti program koji, koristeci WHILE petlju,racuna proizvod unetih brojeva sve dok korisnik ne unese 0

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

        while (broj == 0) {
            System.out.println("Unesite broj koji nije nula: ");
            broj = s.nextInt();
        }

        int proizvod = broj;

        while (broj != 0){
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 0) {
                break;
            }
            proizvod *= broj;
        }
        System.out.println("Proizvod je " + proizvod);
    }
}

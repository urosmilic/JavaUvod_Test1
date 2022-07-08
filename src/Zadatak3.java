import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
      //3. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu.
        // Korisnik preko skenera unese koji broj zeli da prebroji u nizu

        Scanner s = new Scanner(System.in);
        int [] niz = {1,2,3,5,8,2,6,2,3,5,9,1};

        System.out.println("Unesite broj koji zelite da proverite: ");
        int n = s.nextInt();

        int ponavljanje = 0;

        for (int i = 0; i < niz.length; i++) {
            if (n == niz[i]) {
                ponavljanje++;
            }
        }

        System.out.println("Vas broj se pojavljuje " + ponavljanje + " puta.");

    }
}

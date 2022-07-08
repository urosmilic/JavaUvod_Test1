public class Zadatak1 {
    public static void main(String[] args) {
        //1. Napraviti program koji nalazi najveci broj u niz i vraca informaciju da li je taj najveci broj paran

        int [] niz = {1,2,10,4,5,4,18,2,1};
        int max = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        System.out.println("Najveci broj u nizu je " + max);

        if (max % 2 == 0) {
            System.out.println("Najveći broj je paran.");
        } else {
            System.out.println("Najveći broj nije paran.");
        }

    }
}

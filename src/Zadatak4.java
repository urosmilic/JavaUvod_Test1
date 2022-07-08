public class Zadatak4 {
    public static void main(String[] args) {
        //4. Napraviti program koji uzme kreiran niz i napravi drugi niz od postojeceg samo sa obrnutim redosledom clanova
        //Na primer ako prvi niz ima clanove {1,2,3} onda drugi niz treba da ima clanove {3,2,1}

        int [] nizA = {1,4,3,8,2,1,-9,12,4};
        int n = nizA.length;
        int [] nizB = new int[n];
        int j = n - 1;

        for (int i = 0; i < nizA.length; i++) {
            nizB[j] = nizA[i];
            j--;
        }

        for (int i = 0; i < nizB.length; i++) {
            System.out.println(nizB[i]);
        }

    }
}

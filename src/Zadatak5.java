import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite tip vozila (motor, automobil ili kamion): ");
        String vozilo = s.next();
        System.out.println("Unesite tip goriva (benzin ili dizel): ");
        String gorivo = s.next();
        System.out.println("Unesite predjenu distancu (u kilometrima): ");
        double distanca = s.nextDouble();

        String voziloIgorivo = vozilo + "-" + gorivo;

        int potrosnjaMotor = 5;
        int potrosnjaAutomobil = 9;
        int potrosnjaKamion = 15;
        int cenaBenzin = 170;
        int cenaDizel = 190;

        switch (voziloIgorivo) {
            case "motor-benzin":
                System.out.println("Ukupna potrosnja goriva iznosi " + (potrosnjaMotor * distanca / 100) + " litara.");
                System.out.println("Ukupna cena iznosi " + (potrosnjaMotor * distanca * cenaBenzin / 100) + " dinara.");
                break;
            case "motor-dizel":
                System.out.println("Ukupna potrosnja goriva iznosi " + (potrosnjaMotor * distanca / 100) + " litara.");
                System.out.println("Ukupna cena iznosi " + (potrosnjaMotor * distanca * cenaDizel / 100) + " dinara.");
                break;
            case "automobil-benzin":
                System.out.println("Ukupna potrosnja goriva iznosi " + (potrosnjaAutomobil * distanca / 100) + " litara.");
                System.out.println("Ukupna cena iznosi " + (potrosnjaAutomobil * distanca * cenaBenzin / 100) + " dinara.");
                break;
            case "automobil-dizel":
                System.out.println("Ukupna potrosnja goriva iznosi " + (potrosnjaAutomobil * distanca / 100) + " litara.");
                System.out.println("Ukupna cena iznosi " + (potrosnjaAutomobil * distanca * cenaDizel / 100) + " dinara.");
                break;
            case "kamion-benzin":
                System.out.println("Ukupna potrosnja goriva iznosi " + (potrosnjaKamion * distanca / 100) + " litara.");
                System.out.println("Ukupna cena iznosi " + (potrosnjaKamion * distanca * cenaBenzin / 100) + " dinara.");
                break;
            case "kamion-dizel":
                System.out.println("Ukupna potrosnja goriva iznosi " + (potrosnjaKamion * distanca / 100) + " litara.");
                System.out.println("Ukupna cena iznosi " + (potrosnjaKamion * distanca * cenaDizel / 100) + " dinara.");
                break;
            default:
                System.out.println("Niste uneli validne podatke!");
                break;
        }
    }
}

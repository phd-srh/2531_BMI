import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Eingabe
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String name = eingabe.nextLine();
        System.out.print("Bitte geben Sie Ihr Geburtsjahr ein: ");
        int geburtsjahr = eingabe.nextInt();
        System.out.print("Bitte geben Sie Ihr Gewicht ein: ");
        double gewicht = eingabe.nextDouble();
        System.out.print("Bitte gegen Sie Ihre Körpergröße ein: ");
        double körpergröße = eingabe.nextDouble();

        // Verarbeitung
        int jahre = 0 /* TODO: berechne...*/;
        double bmi = 0 /* TODO: berechne...*/;

        // Ausgabe
        System.out.println("Hallo " + name + ",");
        System.out.println("Ihr Alter beträgt " + jahre + " Jahre");
        System.out.println("Ihr BMI beträgt " + bmi);
        // ein paar andere Ausgaben ...
    }
}

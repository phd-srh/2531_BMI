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
        int jahre = 2023 - geburtsjahr;
        double bmi = gewicht / (körpergröße * körpergröße);

        // Ausgabe
        System.out.println("Hallo " + name + ",");
        System.out.println("Ihr Alter beträgt " + jahre + " Jahre");
        System.out.println("Ihr BMI beträgt " + bmi);
        // ein paar andere Ausgaben ...
        if (bmi < 18.5) {
            System.out.println("Untergewicht");
        }
        if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normalgewicht");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("Übergewicht");
        }
        if (bmi >= 30) {
            System.out.println("ungesundes Übergewicht");
        }
    }
}

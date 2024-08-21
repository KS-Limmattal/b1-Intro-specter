/*
 * Bemerkung: Eine Funktion ist eine Methode/ ein Befehl mit einem Rückgabewert.
 */

public class Calculations {
    
    // Funktionen wie in der Mathematik
    public static int square(int base){
        return base * base;
    }

    public static double betrag(double zahl){
        if (zahl < 0){
            return -zahl;
        } else {
            return zahl;
        }
    }

    public static void main(String[] args) {
        
        // Rechnungen mit Ganzzahlen
        int a = -11;
        int b = 3;
        System.out.println("Rechnung: " + a + b); // Wie kann ich hier das Resultat anzeigen lassen?

        System.out.println(123456 / 10);
        System.out.println(123456 % 10);

        // Rechnungen mit Fliesskommazahlen
        double f = 3.2;
        double g = -4;
        System.out.println(f * g);
        System.out.println(a * g);

        // Funktionen wie in der Mathematik
        System.out.println(square(-2));
        System.out.println(square(a));
        System.out.println(square(a + b));
        //System.out.println(square(2.5)); // Scheitert wegen falschem Argumenttyp!
        System.out.println(betrag(3.1));
        System.out.println(betrag(-1.1));
        System.out.println(betrag(a)); // Funktioniert trotz falschem Argumenttyp wegen automatischem Type Casting (=Typkonversion)
        double c = betrag(square(-20));
        System.out.println(c);
    }
}
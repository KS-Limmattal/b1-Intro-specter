public class Loops {
    
    public static String primeFactorisation(int n) {
        if (n == 1) {
            return "Prime factorisation of 1 = 1";
        }

        int res = n;
        String out_res = "";
        int i = 2;

        while (res > 1) {
            boolean prime = false;
            for (int j = 2; i % j != 0 || i == 2 || i == j; j++) {
                prime = j == i;
                if (j == i) {
                    break;
                }
            }

            if (prime && res % i == 0) {
                out_res += (out_res.length() == 0) ? Integer.toString(i) : (" * " + Integer.toString(i));
                res /= i;
            } else {
                i++;
            }
        }
        return "Prime factorisation of " + n + " = " + out_res;
    }

    public static double pi(int digits) {
        long summanden = (long) (Math.pow(10, digits) / 2);
        double partialSumme1 = 0.d;
        partialSumme1 += 1.;
        partialSumme1 += -1. / 3;

        for (long k = 2L; k < summanden; k++) {
            partialSumme1 += ((k % 2 == 0) ? 1. : -1.) / (2 * k + 1);
        }

        double partialSumme2 = 2 * (partialSumme1 + Math.pow(-1, summanden) / (2 * summanden + 1));
        partialSumme1 *= 2;

        return partialSumme1 + partialSumme2;
        
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        System.out.println(primeFactorisation(12));
        System.out.println(primeFactorisation(20));
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            System.out.println("Pi approximated to " + n + " digits with pi() is " + pi(n));
        }
        // die Anzahl mögliche Nachkommastellen kommt auf die gebrauchten Datentypen drauf an
        // Meine pi() Funktion gibt ein double aus, also kann es maximal 15 Nachkommastellen angeben
        // Die absolute Grenze stammt aus dem Parameter, welcher der Aufgabenstellung nach ein int sein muss.
        // Daher sind rein theoretisch 4’294’967’295 Nachkommastellen für diese Aufgabe möglich

    }
}

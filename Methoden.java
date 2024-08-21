public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    public static String hours(int seconds){
        int hours = (int) seconds / 3600;
        int minutes = (int) (seconds % 3600) / 60;
        int remaining_seconds = (int) seconds % 60;
        String out_mins = (minutes < 10) ? ('0' + Integer.toString(minutes)) : Integer.toString(minutes);
        String out_secs = (remaining_seconds < 10) ? ('0' + Integer.toString(remaining_seconds)) : Integer.toString(remaining_seconds);
        return hours + ":" + out_mins + ":" + out_secs;
    }

    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        // TODO: Schreibe mehr Testcode
        System.out.println(hours(0));
        System.out.println(hours(-1000));
        System.out.println(hours(4000));

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println(distance(0, 0, 0, 1));
        System.out.println(distance(0, 0, 1, 1));
        System.out.println(distance(100,100, 0, 25));
    }
    
}

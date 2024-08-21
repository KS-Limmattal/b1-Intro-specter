public class Arrayz {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    public static double[] sort(double[] in_array) {
        double[] ret_array = in_array.clone();
        for (int i = 1; i < ret_array.length; i++) {
            if (ret_array[i-1] > ret_array[i]) {
                double temp = ret_array[i-1];
                ret_array[i-1] = ret_array[i];
                ret_array[i] = temp;
                i = 0;
            }
        }
        return ret_array;
    }

    public static boolean isMagicSquare(int[][] in_square) {
        boolean result = true;

        int sum = 0;
        for (int h : in_square[0]) {
            sum += h;
        }

        int diagonal_sum1 = 0;
        int diagonal_sum2 = 0;

        for (int i = 0; i < in_square.length; i++) {
            diagonal_sum1 += in_square[i][i];
            diagonal_sum2 += in_square[i][((in_square.length - i) - 1)];

            int row_sum = 0;
            int column_sum = 0;
            for (int j = 0; j < in_square.length; j++) {
                row_sum += in_square[i][j];
                column_sum += in_square[j][i];
            }

            result = sum == row_sum && sum == column_sum;
        }
        result = (result) ? sum == diagonal_sum1 && sum == diagonal_sum2 : false;

        return result;
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        double[] sorted = {0.d, 1.d, 2.d, 3.d, 4.d};
        for (double i : sort(sorted)) {
            System.out.print(i + " ");
        }
        System.out.println();

        double[] unsorted = {4.d, 3.d, 2.d, 1.d, 0.d};
        for (double i : sort(unsorted)) {
            System.out.print(i + " ");
        }
        System.out.println();

        double[] very_unsorted = {-3.d, 25.001d, 25.0001d, -10.d, 0.d, 25.d};
        for (double i : sort(very_unsorted)) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { 
                { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { 
                { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
    }
}

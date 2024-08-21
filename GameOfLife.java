import java.util.concurrent.TimeUnit;

public class GameOfLife {
    public static boolean[][] createRandom(int m, int n) {
        boolean[][] out_array = new boolean[n][m];
        for (int i = 0; i < out_array.length; i++) {
            for (int j = 0; j < out_array[0].length; j++) {
                out_array[i][j] = Math.round(Math.random()) == 0;
            }
        }
        return out_array;
    }

    public static boolean conwayEval(boolean[][] cells, int y, int x) {
        boolean target_living = cells[y][x];
        int living_neighbours = 0;
        for (int i = y - 1; i < y + 2; i++) {
            for (int j = x - 1; j < x + 2; j++) {
                if (i == y && j == x) {continue;}
                int ii = (i < 0) ? cells.length - 1 : ((i > cells.length - 1) ? 0 : i);
                int jj = (j < 0) ? cells[0].length - 1 : ((j > cells[0].length - 1) ? 0 : j);
                living_neighbours += (cells[ii][jj]) ? 1 : 0;
            }
        }
        return (target_living && (living_neighbours == 2 || living_neighbours == 3)) || (!target_living && living_neighbours == 3);
    }

    public static boolean[][] getNextGeneration(boolean[][] cells) {
        boolean[][] out_cells = new boolean[cells.length][cells[0].length];
        for (int i = 0; i < out_cells.length; i++) {
            for (int j = 0; j < out_cells[0].length; j++) {
                out_cells[i][j] = conwayEval(cells, i, j);
            }
        }
        return out_cells;
    }

    public static void printCells(boolean[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                System.out.print(((cells[i][j]) ? "■" : ".") + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int m = 7;
        int n = 7;
        int numberOfGenerations = 20;

        /*
        boolean[][] array = { // glider demo
            {false, false, true, false, false}, 
            {true, false, true, false, false}, 
            {false, true, true, false, false}, 
            {false, false, false, false, false}, 
            {false, false, false, false, false}, 
        };
        */

        boolean[][] array = createRandom(m, n);

        for (int i = 0; i <= numberOfGenerations; i++) {
            System.out.println(i + ":");
            printCells(array);
            array = getNextGeneration(array);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}

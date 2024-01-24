import java.util.*;
import java.util.Arrays;

public class BVRR {
    static final int INFINITY = 9999;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of nodes");
        int nodes = s.nextInt();
        int cm[][] = new int[nodes][nodes];
        System.out.println("Enter cost matrix:");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                cm[i][j] = s.nextInt();
            }
        }

        int[][] dt = new int[nodes][nodes];
        for (int i = 0; i < nodes; i++) {
            dt[i] = Arrays.copyOf(cm[i], nodes);
        }

        for (int k = 0; k < nodes; k++) {
            System.out.println("Intermediate table after iteration " + (k + 1) + ":");
            for (int i = 0; i < nodes; i++) {
                for (int j = 0; j < nodes; j++) {
                    if (dt[i][j] > dt[i][k] + dt[k][j]) {
                        dt[i][j] = dt[i][k] + dt[k][j];
                    }
                    System.out.print(dt[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
           }

        System.out.println("Final table after all iterations:");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                System.out.print(dt[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class main {
	public static final int inf = 999;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int n = sc.nextInt();
        int c[][] = new int[n][n];
        int a[][] = new int[n][n];

        System.out.println("Enter the weights for the edges (space-separated):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = sc.nextInt();
                if (i != j && c[i][j] == 0) {
                    c[i][j] = inf;
                }
                a[i][j] = c[i][j];
            }
        }

        System.out.println("Enter source vertex: ");
        int s = sc.nextInt();

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] > a[i][k] + a[k][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }
          for (int j = 0; j < n; j++) {
            System.out.println("Distance from " + s + " to " + j + " is: " + a[s][j]);
        }
    }
}

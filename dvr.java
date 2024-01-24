import java.util.*;
public class VRA {
public static void output(int graph[][],int n) {
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
System.out.print(graph[i][j]+" ");
}
System.out.println();
}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Number of nodes : ");
int n = sc.nextInt();
int graph[][] = new int[n][n];
System.out.println("Enter graph : ");
for(int i=0;i<n;i++) {
for(int j =0;j<n;j++) {
graph[i][j]=sc.nextInt();
}
}
for(int k=0;k<n;k++) {
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++){
graph[i][j]=Math.min(graph[i][j], 
graph[i][k]+graph[k][j]);
}
}
}
System.out.println("Final : ");
output(graph,n);
sc.close();
}
}

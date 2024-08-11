import java.util.*;

public class Soti_Interview_3 {
    public static int functionname(int N, int M, int[][] R) {
        // Initialize distance matrix and path count matrix
        int[][] dist = new int[N + 1][N + 1];
        int[][] pathCount = new int[N + 1][N + 1];

        // Set initial distances to infinity and 0 for self-loops
        for (int i = 1; i <= N; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
            pathCount[i][i] = 1;
        }

        // Fill in the distance matrix with edge weights
        for (int i = 0; i < M; i++) {
            int a = R[i][0];
            int b = R[i][1];
            int d = R[i][2];
            dist[a][b] = d;
            dist[b][a] = d;
            pathCount[a][b] = 1;
            pathCount[b][a] = 1;
        }

        // Floyd-Warshall algorithm to find all pairs shortest paths
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        if (dist[i][j] > dist[i][k] + dist[k][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                            pathCount[i][j] = pathCount[i][k] * pathCount[k][j];
                        } else if (dist[i][j] == dist[i][k] + dist[k][j]) {
                            pathCount[i][j] += pathCount[i][k] * pathCount[k][j];
                        }
                    }
                }
            }
        }

        // Calculate the total length of unused roads
        int totalLength = 0;
        for (int i = 0; i < M; i++) {
            int a = R[i][0];
            int b = R[i][1];
            int d = R[i][2];
            boolean used = false;
            for (int j = 1; j <= N && !used; j++) {
                for (int k = 1; k <= N && !used; k++) {
                    if (j != k && dist[j][k] == dist[j][a] + d + dist[b][k]) {
                        used = true;
                    }
                }
            }
            if (!used) {
                totalLength += d;
            }
        }

        return totalLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of nodes (N) and edges (M)
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Initialize the edge list
        int[][] R = new int[M][3];
        for (int i = 0; i < M; i++) {
            R[i][0] = sc.nextInt();
            R[i][1] = sc.nextInt();
            R[i][2] = sc.nextInt();
        }
        sc.close();

        // Calculate the total length of unused roads
        int unusedLength = functionname(N, M, R);
        System.out.println(unusedLength * 2);  // multiplied by 2 since roads are bidirectional
    }
}

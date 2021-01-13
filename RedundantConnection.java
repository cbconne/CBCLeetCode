import java.util.Arrays;

public class RedundantConnection {
    public static void main(String[] args) {
        int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, { 1, 5 } };
        System.out.println(Arrays.toString(findRedundantConnection(edges)));
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int[] root = new int[edges.length + 1];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            if (find(root, edges[i][0]) != find(root, edges[i][1])) {
                union(root, edges[i][0], edges[i][1]);
            } else {
                return edges[i];
            }
        }
        return null;
    }

    public static void union(int[] root, int node1, int node2) {
        root[find(root, node1)] = find(root, node2);
    }

    public static int find(int[] root, int node) {
        if (root[node] != node) {
            root[node] = find(root, root[node]);
        }
        return root[node];
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinCosttoConnectAllPoints {
    public static void main(String[] args) {
        int[][] points = { { -14, -14 }, { -18, 5 }, { 18, -10 }, { 18, 18 }, { 10, -2 } };
        MinCosttoConnectAllPoints minCosttoConnectAllPoints = new MinCosttoConnectAllPoints();
        System.out.println(minCosttoConnectAllPoints.minCostConnectPoints(points));
    }

    public int minCostConnectPoints(int[][] points) {
        List<Edge> edgeList = new ArrayList<>();
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                edgeList.add(
                        new Edge(Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]), i, j));
            }
        }

        Collections.sort(edgeList, new Comparator<Edge>() {
            public int compare(Edge edge1, Edge edge2) {
                return edge1.length - edge2.length;
            }
        });

        int res = 0;
        UnionFind unionFind = new UnionFind(points.length);
        for (int i = 0; i < edgeList.size(); i++) {
            if (unionFind.find(unionFind.root[edgeList.get(i).x]) != unionFind
                    .find(unionFind.root[edgeList.get(i).y])) {
                res += edgeList.get(i).length;
                unionFind.union(edgeList.get(i).x, edgeList.get(i).y);
            }
        }

        return res;
    }

}

class Edge {
    int length;
    int x;
    int y;

    public Edge(int length, int x, int y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }
}

class UnionFind {
    int[] root;

    public UnionFind(int n) {
        int[] root = new int[n];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
        this.root = root;
    }

    public int find(int i) {
        if (root[root[i]] != root[i]) {
            root[i] = find(root[root[i]]);
        }
        return root[i];
    }

    public void union(int i, int j) {
        if (find(i) != find(j)) {
            if (root[i] == i && root[j] != j) {
                root[root[i]] = root[j];
            } else {
                root[root[j]] = root[i];
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PathWithMinimumEffort {
    public static void main(String[] args) {
        int[][] heights = { { 1, 2, 1, 1, 1 }, { 1, 2, 1, 2, 1 }, { 1, 2, 1, 2, 1 }, { 1, 2, 1, 2, 1 },
                { 1, 1, 1, 2, 1 } };
        PathWithMinimumEffort pathWithMinimumEffort = new PathWithMinimumEffort();
        System.out.println(pathWithMinimumEffort.minimumEffortPath(heights));
    }

    public int minimumEffortPath(int[][] heights) {
        int amount = heights.length * heights[0].length;
        UnionFind_20210129 unionFind = new UnionFind_20210129(amount);
        List<Edge_20210129> edges = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (i > 0) {
                    edges.add(new Edge_20210129(xy2i(i - 1, j, heights), xy2i(i, j, heights),
                            Math.abs(heights[i][j] - heights[i - 1][j])));
                }
                if (j > 0) {
                    edges.add(new Edge_20210129(xy2i(i, j - 1, heights), xy2i(i, j, heights),
                            Math.abs(heights[i][j] - heights[i][j - 1])));
                }
            }
        }
        edges.sort(new Comparator<Edge_20210129>() {
            public int compare(Edge_20210129 edge1, Edge_20210129 edge2) {
                return edge1.length - edge2.length;
            }
        });
        for (int i = 0; i < edges.size(); i++) {
            if (unionFind.find(edges.get(i).x) != unionFind.find(edges.get(i).y)) {
                unionFind.union(edges.get(i).x, edges.get(i).y);
                if (unionFind.find(xy2i(0, 0, heights)) == unionFind
                        .find(xy2i(heights.length - 1, heights[0].length - 1, heights))) {
                    return edges.get(i).length;
                }
            }
        }
        return 0;
    }

    public int xy2i(int row, int column, int[][] heights) {
        return row * heights[0].length + column;
    }
}

class Edge_20210129 {
    int x;
    int y;
    int length;

    public Edge_20210129(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }
}

class UnionFind_20210129 {
    int[] root;

    public UnionFind_20210129(int n) {
        int[] root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }
        this.root = root;
    }

    public int find(int i) {
        if (root[root[i]] != root[i]) {
            root[i] = find(root[i]);
        }
        return root[i];
    }

    public void union(int i, int j) {
        if (root[i] == i && root[j] != j) {
            root[root[i]] = root[j];
        } else {
            root[root[j]] = root[i];
        }
    }
}
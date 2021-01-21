import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * FindCriticalandPseudo_CriticalEdgesinMinimumSpanningTree
 */
public class FindCriticalandPseudo_CriticalEdgesinMinimumSpanningTree {

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = { { 0, 1, 1 }, { 1, 2, 1 }, { 0, 2, 1 }, { 2, 3, 4 }, { 3, 4, 2 }, { 3, 5, 2 }, { 4, 5, 2 } };
        FindCriticalandPseudo_CriticalEdgesinMinimumSpanningTree findCriticalandPseudo_CriticalEdgesinMinimumSpanningTree = new FindCriticalandPseudo_CriticalEdgesinMinimumSpanningTree();
        System.out.println(
                findCriticalandPseudo_CriticalEdgesinMinimumSpanningTree.findCriticalAndPseudoCriticalEdges(n, edges));
    }

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<Integer> keyEdge = new ArrayList<>();
        List<Integer> fakeKeyEdge = new ArrayList<>();
        List<Edge_20210121> edgesList = new ArrayList<>(edges.length);
        for (int i = 0; i < edges.length; i++) {
            edgesList.add(new Edge_20210121(edges[i][0], edges[i][1], edges[i][2]));
        }
        List<Edge_20210121> edgesListTemp = new ArrayList<>(edgesList);
        Collections.sort(edgesListTemp, new Comparator<Edge_20210121>() {
            public int compare(Edge_20210121 edge1, Edge_20210121 edge2) {
                return edge1.length - edge2.length;
            }
        });
        int value = kruskal(n, edgesListTemp);
        for (int i = 0; i < edgesList.size(); i++) {
            List<Edge_20210121> edgesListTemp2 = new ArrayList<>(edgesList);
            edgesListTemp2.remove(i);
            Collections.sort(edgesListTemp2, new Comparator<Edge_20210121>() {
                public int compare(Edge_20210121 edge1, Edge_20210121 edge2) {
                    return edge1.length - edge2.length;
                }
            });
            int v = kruskal(n, edgesListTemp2);
            if (v != value) {
                keyEdge.add(i);
            } else {
                v = kruskal(n, edgesListTemp2, edgesList.get(i));
                if (v == value) {
                    fakeKeyEdge.add(i);
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(keyEdge);
        res.add(fakeKeyEdge);
        return res;
    }

    public int kruskal(int n, List<Edge_20210121> edgesList) {
        UnionFind_20210121 unionFind = new UnionFind_20210121(n);
        int res = 0;
        for (Edge_20210121 edge : edgesList) {
            if (unionFind.find(edge.i) != unionFind.find(edge.j)) {
                unionFind.union(edge.i, edge.j);
                res += edge.length;
            }
        }
        int count = 0;
        for (int i = 0; i < unionFind.root.length; i++) {
            if (unionFind.root[i] == i) {
                count++;
            }
        }
        if (count == 1) {
            return res;
        } else {
            return -1;
        }
    }

    public int kruskal(int n, List<Edge_20210121> edgesList, Edge_20210121 testEdge) {
        UnionFind_20210121 unionFind = new UnionFind_20210121(n);
        int res = 0;
        unionFind.union(testEdge.i, testEdge.j);
        res += testEdge.length;
        for (Edge_20210121 edge : edgesList) {
            if (unionFind.find(edge.i) != unionFind.find(edge.j)) {
                unionFind.union(edge.i, edge.j);
                res += edge.length;
            }
        }
        int count = 0;
        for (int i = 0; i < unionFind.root.length; i++) {
            if (unionFind.root[i] == i) {
                count++;
            }
        }
        if (count == 1) {
            return res;
        } else {
            return -1;
        }
    }
}

class UnionFind_20210121 {
    int[] root;

    public UnionFind_20210121(int n) {
        int[] root = new int[n];
        for (int i = 0; i < n; i++) {
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
        if (root[i] == i && root[j] != j) {
            root[root[i]] = root[j];
        } else {
            root[root[j]] = root[i];
        }
    }
}

class Edge_20210121 {
    int i;
    int j;
    int length;

    public Edge_20210121(int i, int j, int length) {
        this.i = i;
        this.j = j;
        this.length = length;
    }
}
import java.util.HashSet;
import java.util.Set;

public class NumberofProvinces {

    public static void main(String[] args) {
        int[][] isConnected = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        System.out.println(findCircleNum(isConnected));
    }

    public static int findCircleNum(int[][] isConnected) {
        int numberofCity = isConnected.length;
        int[] root = new int[numberofCity];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
        for (int i = 0; i < numberofCity; i++) {
            for (int j = i + 1; j < numberofCity; j++) {
                if (isConnected[i][j] == 1) {
                    merge(i, j, root);
                }
            }
        }
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < root.length; i++) {
            res.add(find(i, root));
        }
        return res.size();
    }

    public static int find(int i, int[] root) {
        if (root[i] == i) {
            return i;
        } else {
            root[i] = find(root[i], root);
            return root[i];
        }
    }

    public static void merge(int i, int j, int[] root) {
        root[find(j, root)] = find(i, root);
    }
}

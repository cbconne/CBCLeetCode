public class RemoveStones {
    public static void main(String[] args) {
        RemoveStones removeStones = new RemoveStones();
        int[][] stones = { { 4, 4 }, { 5, 5 }, { 3, 1 }, { 1, 4 }, { 1, 1 }, { 2, 3 }, { 0, 3 }, { 2, 4 }, { 3, 5 } };
        System.out.println(removeStones.removeStones(stones));
    }

    public int removeStones(int[][] stones) {
        int[] root = new int[stones.length];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
        for (int i = 0; i < stones.length - 1; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    union(i, j, root);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < root.length; i++) {
            find(i, root);
            if (root[i] == i) {
                count++;
            }
        }
        return stones.length - count;
    }

    private void union(int stone1, int stone2, int[] root) {
        if (find(stone1, root) != find(stone2, root)) {
            if (root[stone2] == stone2) {
                root[root[stone2]] = root[stone1];
            } else {
                root[root[stone1]] = root[stone2];
            }
        }
    }

    private int find(int stone, int[] root) {
        if (root[root[stone]] != root[stone]) {
            root[stone] = find(root[stone], root);
        }
        return root[stone];
    }
}

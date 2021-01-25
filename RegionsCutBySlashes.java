public class RegionsCutBySlashes {
    public static void main(String[] args) {
        RegionsCutBySlashes regionsCutBySlashes = new RegionsCutBySlashes();
        String[] grid = { "//", "/ " };
        System.out.println(regionsCutBySlashes.regionsBySlashes(grid));
    }

    public int regionsBySlashes(String[] grid) {
        int total = 4 * grid.length * grid.length;
        UnionFind_20210125 unionFind = new UnionFind_20210125(total);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                if (grid[i].charAt(j) == ' ') {
                    unionFind.union(ij2n(i, j, grid.length), ij2n(i, j, grid.length) + 1);
                    unionFind.union(ij2n(i, j, grid.length), ij2n(i, j, grid.length) + 2);
                    unionFind.union(ij2n(i, j, grid.length), ij2n(i, j, grid.length) + 3);
                } else if (grid[i].charAt(j) == '/') {
                    unionFind.union(ij2n(i, j, grid.length), ij2n(i, j, grid.length) + 1);
                    unionFind.union(ij2n(i, j, grid.length) + 2, ij2n(i, j, grid.length) + 3);
                } else {
                    unionFind.union(ij2n(i, j, grid.length) + 1, ij2n(i, j, grid.length) + 2);
                    unionFind.union(ij2n(i, j, grid.length), ij2n(i, j, grid.length) + 3);
                }
                if (j != grid[0].length() - 1) {
                    unionFind.union(ij2n(i, j, grid.length) + 2, ij2n(i, j + 1, grid.length));
                }
                if (i != grid.length - 1) {
                    unionFind.union(ij2n(i, j, grid.length) + 3, ij2n(i + 1, j, grid.length) + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < unionFind.root.length; i++) {
            if (unionFind.find(i) == i) {
                res++;
            }
        }
        return res;
    }

    public int ij2n(int i, int j, int l) {
        return (i * l * 4 + j * 4);
    }
}

class UnionFind_20210125 {
    int[] root;

    public UnionFind_20210125(int n) {
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
        find(i);
        find(j);
        if (root[i] == i && root[j] != j) {
            root[root[i]] = root[j];
        } else {
            root[root[j]] = root[i];
        }
    }
}

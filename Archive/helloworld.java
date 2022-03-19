public class helloworld {
    public static void main(String[] args) {
        // char[][] board = { { 'x', 'x', 'x', 'x' }, { 'x', 'o', 'o', 'x' }, { 'x',
        // 'x', 'o', 'x' },
        // { 'x', 'o', 'x', 'x' } };
        // char[][] board ={};
        char[][] board = { { 'x', 'o', 'x', 'o', 'x', 'o' }, { 'o', 'x', 'o', 'x', 'o', 'x' },
                { 'x', 'o', 'x', 'o', 'x', 'o' }, { 'o', 'x', 'o', 'x', 'o', 'x' } };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        solve(board);
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            dfs(board, i, 0);
            dfs(board, i, board[0].length - 1);
        }
        for (int j = 1; j < board[0].length - 1; j++) {
            dfs(board, 0, j);
            dfs(board, board.length - 1, j);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'o') {
                    board[i][j] = 'x';
                } else if (board[i][j] == 'a') {
                    board[i][j] = 'o';
                }
            }
        }
    }

    public static void dfs(char[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'o') {
            return;
        }
        board[x][y] = 'a';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);
    }
}
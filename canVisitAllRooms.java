import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * canVisitAllRooms
 */
public class canVisitAllRooms {

    static boolean[] visited_dfs, visited_bfs;
    static int num_dfs, num_bfs;

    public static void main(String[] args) {
        int[][] r = { { 1, 3 }, { 3, 0, 1 }, { 2 }, { 0 } };
        List<List<Integer>> rooms = new ArrayList<>();
        for (int i = 0; i < r.length; i++) {
            List<Integer> keys = Arrays.stream(r[i]).boxed().collect(Collectors.toList());
            rooms.add(keys);
        }
        System.out.println(VisitAllRooms_DFS(rooms));
        System.out.println(VisitAllRooms_BFS(rooms));
    }

    public static boolean VisitAllRooms_DFS(List<List<Integer>> rooms) {
        int n = rooms.size();
        num_dfs = 0;
        visited_dfs = new boolean[n];
        dfs(rooms, 0);
        return num_dfs == n;
    }

    public static void dfs(List<List<Integer>> rooms, int x) {
        visited_dfs[x] = true;
        num_dfs++;
        for (int i : rooms.get(x)) {
            if (!visited_dfs[i]) {
                dfs(rooms, i);
            }
        }
    }

    public static boolean VisitAllRooms_BFS(List<List<Integer>> rooms) {
        int n = rooms.size();
        num_bfs = 0;
        visited_bfs = new boolean[n];
        Queue<Integer> que = new LinkedList<Integer>();
        visited_bfs[0] = true;
        que.offer(0);
        while (!que.isEmpty()) {
            int x = que.poll();
            num_bfs++;
            for (int i : rooms.get(x)) {
                if (!visited_bfs[i]) {
                    visited_bfs[i] = true;
                    que.offer(i);
                }

            }
        }
        return num_bfs == n;
    }
}
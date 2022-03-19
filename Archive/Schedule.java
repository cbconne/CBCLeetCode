import java.util.LinkedList;
import java.util.Queue;

public class Schedule {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 }, { 0, 1 } };
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] flag = new int[numCourses][numCourses];
        int[] pre = new int[numCourses];
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < prerequisites.length; i++) {
            flag[prerequisites[i][0]][prerequisites[i][1]] = 1;
            pre[prerequisites[i][0]]++;
        }
        for (int i = 0; i < numCourses; i++) {
            if (pre[i] == 0) {
                queue.offer(i);
            }
        }
        int visited = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            visited++;
            for (int i = 0; i < numCourses; i++) {
                if (flag[i][u] == 1) {
                    pre[i]--;
                    if (pre[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }
        return visited == numCourses;
    }
}
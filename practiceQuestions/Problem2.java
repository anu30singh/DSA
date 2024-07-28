import java.util.*;

public class Problem2 {
    
    private static int findCycleSumBFS(int[] edge, int start, int[] count) {
        int n = edge.length;
        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        Arrays.fill(count, 0);
        int maxSum = -1;

        queue.offer(start);
        count[start] = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            int next = edge[node];

            if (next == -1) continue;

            if (count[next] == 0) {
                queue.offer(next);
                count[next] = count[node] + 1;
                parent[next] = node;
            } else if (count[next] > 0 && count[next] < count[node]) {
                // Cycle detected
                int cycleSum = 0;
                int currentNode = node;
                while (currentNode != next) {
                    cycleSum += currentNode;
                    currentNode = parent[currentNode];
                }
                cycleSum += next;
                maxSum = Math.max(maxSum, cycleSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] edge = new int[N];
        for (int i = 0; i < N; i++) {
            edge[i] = scanner.nextInt();
        }
        scanner.close();

        int[] count = new int[N];
        int maxSum = -1;

        for (int i = 0; i < N; i++) {
            if (count[i] == 0) {
                int cycleSum = findCycleSumBFS(edge, i, count);
                maxSum = Math.max(maxSum, cycleSum);
            }
        }

        System.out.println(maxSum);
    }
}

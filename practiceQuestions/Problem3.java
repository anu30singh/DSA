package practiceQuestions;

import java.util.Arrays;

public class Problem3 {
    int[] size; int[] parent;

    public void DisjointSet (int n) {
        size = new int[n]; parent = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    public int findParent (int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }

    public boolean checkUnion (int u, int v) {
        return findParent(u) == findParent(v);
    }

    public void union (int u, int v) {
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);
        if (ulp_v == ulp_u) return;
        if (size[ulp_u] > size[ulp_v]) {
            parent[ulp_v] = ulp_u;
            size[ulp_u]+= size[ulp_v];
        }  else {
            parent[ulp_u] = ulp_v;
            size[ulp_v]+= size[ulp_u];
        }
    }

}

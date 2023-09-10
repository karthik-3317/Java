package Bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BfsTraversal {
		int[] disc, low;
		int time = 1;
		List<List<Integer>> ans = new ArrayList<>();
		Map<Integer,List<Integer>> edgeMap = new HashMap<>();
		public List<List<Integer>> criticalConnections(int n,
		List<List<Integer>> connections) {
		disc = new int[n]; low =
		new int[n]; for (int i = 0;
		i < n; i++)
		edgeMap.put(i, new ArrayList<Integer>());
		for (List<Integer> conn : connections) {
		edgeMap.get(conn.get(0)).add(conn.get(1));
		edgeMap.get(conn.get(1)).add(conn.get(0));
		}
		BfsTraversal(0, -1);
		return ans;
		}
		public void BfsTraversal(int curr, int prev) {
		disc[curr] = low[curr] = time++; for
		(int next : edgeMap.get(curr)) {
		if (disc[next] == 0) {
		BfsTraversal(next, curr);
		low[curr] = Math.min(low[curr], low[next]);
		} else if (next != prev)
		low[curr] = Math.min(low[curr], disc[next]);
		if (low[next] > disc[curr])
		ans.add(Arrays.asList(curr, next));
		}
		}
		}

		
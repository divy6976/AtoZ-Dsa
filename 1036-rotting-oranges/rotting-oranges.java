class Solution {
    class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    visited[i][j] = 2;
                    q.offer(new Pair(i, j, 0));
                }
            }
        }

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.time;
            ans = t;

            if (r - 1 >= 0 && grid[r - 1][c] == 1 && visited[r - 1][c] != 2) {
                visited[r - 1][c] = 2;
                q.offer(new Pair(r - 1, c, t + 1));
            }

            if (r + 1 < n && grid[r + 1][c] == 1 && visited[r + 1][c] != 2) {
                visited[r + 1][c] = 2;
                q.offer(new Pair(r + 1, c, t + 1));
            }

            if (c - 1 >= 0 && grid[r][c - 1] == 1 && visited[r][c - 1] != 2) {
                visited[r][c - 1] = 2;
                q.offer(new Pair(r, c - 1, t + 1));
            }

            if (c + 1 < m && grid[r][c + 1] == 1 && visited[r][c + 1] != 2) {
                visited[r][c + 1] = 2;
                q.offer(new Pair(r, c + 1, t + 1));
            }
        }

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                if(visited[i][j]!=2){
                    return -1;
                }
            }
        }
    }

        return ans;
    }
}

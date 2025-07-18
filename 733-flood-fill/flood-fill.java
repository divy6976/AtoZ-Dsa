class Solution {
    class Pair {
        int row;
        int col;
        

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
            
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;

     Queue<Pair> q = new LinkedList<>();
       
        int[][] visited = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visited[i][j]=image[i][j];
            }
        }

     int startColor = image[sr][sc];
if (startColor == color) return visited; 

visited[sr][sc] = color;
q.offer(new Pair(sr, sc));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            

            if (r - 1 >= 0 && image[r - 1][c] ==image[sr][sc]  && visited[r - 1][c] != color) {
                visited[r - 1][c] = color;
                q.offer(new Pair(r - 1, c));
            }

            if (r + 1 < n && image[r + 1][c] == image[sr][sc] && visited[r + 1][c] != color) {
                visited[r + 1][c] = color;
                q.offer(new Pair(r + 1, c));
            }

            if (c - 1 >= 0 && image[r][c - 1] == image[sr][sc] && visited[r][c - 1] != color) {
                visited[r][c - 1] = color;
                q.offer(new Pair(r, c - 1));
            }

            if (c + 1 < m && image[r][c + 1] == image[sr][sc] && visited[r][c + 1] != color) {
                visited[r][c + 1] = color;
                q.offer(new Pair(r, c + 1));
            }
        }
return visited;
    }
}
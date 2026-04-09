class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
   int[][] matrix = new int[n][n];

       
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) matrix[i][j]=0;
                else matrix[i][j]=100000000; // infinity
            }
        }

       
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            matrix[u][v]=w;
            matrix[v][u]=w;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][k] + matrix[k][j] < matrix[i][j]){
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }
        int[] freq = new int[n];

for(int i = 0; i < n; i++){
    int count = 0;

  
    for(int j = 0; j < n; j++){
        if(i != j && matrix[i][j] <= distanceThreshold){
            count++;
        }
    }

   
    freq[i] = count;
}

int min = Integer.MAX_VALUE;
int ans = -1;

for(int i = 0; i < n; i++){
    if(freq[i] <= min){
        min = freq[i];
        ans = i; // tie me automatically larger index le lega
    }
}
return ans;

        
    }
}
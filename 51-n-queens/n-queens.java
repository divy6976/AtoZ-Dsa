class Solution {
    public List<List<String>> solveNQueens(int n) {
        
  List<List<String>> result=new ArrayList<>();
  char[][]board=new char[n][n];
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        board[i][j]='.';
    }
  }
  int leftrow[]=new int[n];
  int lowerdiagonal[]=new int[2*n-1];
  int upperdiagonal[]=new int[2*n-1];
  solve(0,result,board,leftrow,lowerdiagonal,upperdiagonal,n);
  return result;


    }


void solve(int col,List<List<String>> result,char[][]board,int leftrow[],int lowerdiagonal[],int upperdiagonal[],int n){
if(col==n){
    result.add(construct(board));
            return;
}

for(int row=0;row<n;row++){
    if(leftrow[row]==0 && lowerdiagonal[row+col]==0 && upperdiagonal[n-1 + col-row]==0){
        board[row][col]='Q';
        leftrow[row]=1;
         lowerdiagonal[row+col]=1;
        upperdiagonal[n-1+col-row]=1;
        solve(col+1,result,board,leftrow,lowerdiagonal,upperdiagonal,n);
        board[row][col]='.';
        leftrow[row]=0;
        lowerdiagonal[row+col]=0;
        upperdiagonal[n-1+col-row]=0;
}

}


}
 public List<String> construct(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            solution.add(new String(board[i]));
        }
        return solution;

}
}
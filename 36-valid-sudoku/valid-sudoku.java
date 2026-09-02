class Solution {
    public boolean isValidSudoku(char[][] board) {


        for(int i=0;i<board.length;i++){
            HashSet<Character> st=new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                 if(st.contains(board[i][j])){
                    return false;
                  }
                  if(board[i][j]!='.'){
                  st.add(board[i][j]);
                  }
            }
        }

        for(int j=0;j<board[0].length;j++){
            HashSet<Character> st=new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(st.contains(board[i][j])){
                    return false;
                } 
                if(board[i][j]!='.'){
                  st.add(board[i][j]);
                  }
            }
        }

        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board[0].length;j+=3){
HashSet<Character> st=new HashSet<>();
                for(int m=i;m<i+3;m++){
                    
                    for(int n=j;n<j+3;n++){
                        if(st.contains(board[m][n])){
                            return false;
                        }
                if(board[m][n]!='.'){
                  st.add(board[m][n]);
                  }
                    }
                }
            }
        }
        return true;

    
        
    }
}
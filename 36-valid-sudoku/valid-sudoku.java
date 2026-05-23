class Solution {
    public boolean isValidSudoku(char[][] board) {


        for(int i=0;i<board.length;i++){
            HashSet<Character> st=new HashSet<>();

            for(int j=0;j<board[0].length;j++){

                if(st.contains(board[i][j])){
                    return false;
                }
                if(board[i][j] == '.'){
                    continue;
                }
                st.add(board[i][j]);
            }
        }

        for(int i=0;i<board[0].length;i++){
            HashSet<Character> st=new HashSet<>();
            for(int j=0;j<board.length;j++){
             if(board[j][i] == '.') continue;

if(st.contains(board[j][i])){
    return false;
}

st.add(board[j][i]);
            }
        }

        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board[0].length;j+=3){

                HashSet<Character> st=new HashSet<>();

                for(int m=i;m<=i+2;m++){
                    for(int n=j;n<=j+2;n++){
                        if(st.contains(board[m][n])){
                            return false;
                        }
                        if(board[m][n] == '.'){
                            continue;
                        }
                        st.add(board[m][n]);
                    }
                }

            }
        }
 return true;
        



                
    }
}
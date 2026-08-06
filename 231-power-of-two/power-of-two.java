class Solution {
    public boolean isPowerOfTwo(int n) {

      

    int cnt =0;

    while(true){
            long ans = (long) Math.pow(2, cnt);
        if(ans > n){
            return false;
        }

        if(ans == n){
           return true;
        }
        cnt = cnt +1;

    }





        
    }
}
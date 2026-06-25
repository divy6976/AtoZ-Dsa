class Solution {
    public int numSub(String s) {

        long cnt = 0;
        long sum = 0;
        int mod = 1000000007;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                cnt++;
                sum = (sum + cnt) % mod;
            }else{
                cnt = 0;
            }
        }

        return (int)sum;
    }
}
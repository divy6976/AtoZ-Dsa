class Solution {
    int square(int a){
        int sum =0;

        while(a>0){
        int digit=a%10;
        sum += (int) Math.pow(digit,2);
        a=a/10;

        }
        return sum;
    }
    public boolean isHappy(int n) {
        
        if(n==1){
            return true;
        }
       HashSet<Integer> set = new HashSet<>();

        while(n>0){
            int ans=square(n);
            n=ans;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            if(n== 1){
                return true;
            }
        }
        return false;

    }
}
class Solution {
    public boolean checkPerfectNumber(int num) {

        long sum =0;

        for(int i=1;i<num;i++){
            if(num%i ==0){
                sum += i;
            }

        }

        int ans=(int) sum;
        String st=String.valueOf(ans);
        String tt=String.valueOf(num);

        if(st.equals(tt)){
            return true;
        }
        return false;



        
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
HashMap<Integer,Integer> mpp=new HashMap<>();
        int l=0;

        int maxlen=0;
    for(int r=0;r<fruits.length;r++){
            mpp.put(fruits[r],mpp.getOrDefault(fruits[r],0)+1);

    while(mpp.size()>2){
           mpp.put(fruits[l], mpp.get(fruits[l]) - 1);
    
    if (mpp.get(fruits[l]) == 0) {
            mpp.remove(fruits[l]);
        }
        l++;
    }
maxlen=Math.max(maxlen,r-l+1);


        }


return maxlen;
    }
}
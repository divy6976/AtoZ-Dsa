class Solution {
    public int[] arrayRankTransform(int[] arr) {

        HashMap<Integer,Integer> mpp=new HashMap<>();
        int cnt=1;
        int[] array=new int[arr.length];
        for(int i=0;i<array.length;i++){
            array[i]=arr[i];
        }
        Arrays.sort(array);

        for(int i=0;i<array.length;i++){
            if(!mpp.containsKey(array[i])){
                mpp.put(array[i],cnt);
                cnt ++;
            }
        }
        int[] ans=new int[arr.length];

        for(int i=0;i<ans.length;i++){
            ans[i]=mpp.get(arr[i]);
        }
        return ans;
    }
}
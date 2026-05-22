class Solution {


    class Pair{
        int freq;
        int num;

        Pair(int freq,int num){
            this.freq=freq;
            this.num=num;
        }

    }



    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer,Integer> mpp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);

        }


        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y) ->{
            if(x.freq == y.freq) return y.num - x.num;
            return y.freq-x.freq;
        });


        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){

            int frequency=entry.getValue();

            pq.add(new Pair(frequency,entry.getKey()));

        }

        int ans[]=new int[k];

        int t=0;

        while(k!=0){
           
            Pair p= pq.poll();
             ans[t++]=p.num;
            k--;

        }


        return ans;

        






        

    }
}
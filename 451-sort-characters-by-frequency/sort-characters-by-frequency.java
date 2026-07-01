class Solution {
    class Pair{
        int freq;
        Character ch;
        Pair(int freq,Character ch){
            this.freq=freq;
            this.ch=ch;

        }
    }
    public String frequencySort(String s) {

        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->{

            if(y.freq == x.freq){
                return y.ch-x.ch;
            }

            return y.freq-x.freq;

        });


        for(Map.Entry<Character,Integer> entry:mpp.entrySet()){
            pq.offer(new Pair(entry.getValue(),entry.getKey()));
        }

        StringBuilder sb=new StringBuilder();

        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int times=p.freq;
            char ch=p.ch;

            while(times!=0){
                sb.append(ch);
                times--;
            }
        }
   return sb.toString();



        
    }
}
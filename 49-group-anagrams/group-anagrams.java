class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,ArrayList<String>> mpp=new HashMap<>();


        for(int i=0;i<strs.length;i++){
            String str=strs[i];

            char []st=str.toCharArray();

            Arrays.sort(st);

            StringBuilder sb=new StringBuilder();

            for(int j=0;j<st.length;j++){
                sb.append(st[j]);
            }

           if(!mpp.containsKey(sb.toString())){
            mpp.put(sb.toString(),new ArrayList<>());

           }
    
         mpp.get(sb.toString()).add(str);




        }

        List<List<String >> ans=new ArrayList<>();

        for(Map.Entry<String,ArrayList<String>> entry:mpp.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;



        
        
    }
}
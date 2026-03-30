class Solution {

    class Pair{
        String str;
        int dist;
        Pair(String str,int dist){
            this.str=str;
            this.dist=dist;
        }

    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Queue<Pair> q=new LinkedList<>();

        q.offer(new Pair(beginWord,1));

        Set<String> st=new HashSet<>();

        for(int i=0;i<wordList.size();i++){
            st.add(wordList.get(i));
        }


        while(!q.isEmpty()){
            Pair p=q.poll();

         String str=p.str;
         int level=p.dist;
         if(str.equals(endWord)){
            return level;
         }

         for(int i=0;i<str.length();i++){
            StringBuilder sb=new StringBuilder(str);
            char ch=str.charAt(i);
            for(int j=0;j<26;j++){
                char dh=(char) (j+'a');
                sb.setCharAt(i,dh);
                String newWord=sb.toString();
                if(st.contains(newWord)){
                    st.remove(newWord);
                    q.offer(new Pair(newWord,level+1));
                }

            }

         }

        

        }

        return 0;




        
    }
}
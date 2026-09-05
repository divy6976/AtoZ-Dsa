class Solution {
    public boolean checkInclusion(String s1, String s2) {

              StringBuilder sb=new StringBuilder();

              char[] ch=s1.toCharArray();
              Arrays.sort(ch);

              

              for(int i=0;i<ch.length;i++){
                sb.append(ch[i]);
              }
              String s=sb.toString();

            int l=0;
            int r=0;

            while(r<s2.length()){
                
                if((r-l+1) == s1.length()){
                    char[] dh=s2.substring(l,r+1).toCharArray();
                    Arrays.sort(dh);
                    StringBuilder sbs=new StringBuilder();
                    for(int i=0;i<dh.length;i++){
                        sbs.append(dh[i]);
                    }
       String d= sbs.toString();
       if(s.equals(d)){
        return true;
       }

     l++;
                }
                r++;
            }

        return false;
    }
}
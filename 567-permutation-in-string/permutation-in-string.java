class Solution {

    public boolean checkInclusion(String s1, String s2) {
       
       char[] ch=s1.toCharArray();
       Arrays.sort(ch);
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<ch.length;i++){
        sb.append(ch[i]);
    }

    String s=sb.toString();
    int len=s.length();

    int l=0;
    int r=0;

    while(r<s2.length()){

        while((r-l+1) > len){
            l++;
        }

        if((r-l+1) == len){
            String part=s2.substring(l,r+1);
            char[] dh=part.toCharArray();
            Arrays.sort(dh);
            StringBuilder sbs=new StringBuilder();
            for(int i=0;i<dh.length;i++){
                sbs.append(dh[i]);
            }
            String compare=sbs.toString();
        
           if(compare.equals(s)){
            return true;
           }
            
        }
        r++;
    }
 return false;


    }
}
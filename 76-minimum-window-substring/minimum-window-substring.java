class Solution {
    public String minWindow(String s, String t) {
        
    int cnt=0;
    int minlength=Integer.MAX_VALUE;
    int sindex=-1;
    int l=0;
    int r=0;
int hash[]=new int[256];
for(int i=0;i<t.length();i++){
    hash[t.charAt(i)]++;
}
    while(r<s.length()){

        if(hash[s.charAt(r)]>0){
            cnt= cnt+1;
        }
        hash[s.charAt(r)]--;

        while(cnt==t.length()){
            if(r-l+1<minlength){
                minlength=r-l+1;
       sindex=l;
                   }
                   hash[s.charAt(l)]++;

                   if(hash[s.charAt(l)]>0){
                    cnt--;
                   }
l++;

        }
        r=r+1;
    }

return sindex==-1 ? "":s.substring(sindex,sindex+minlength);
    }
}
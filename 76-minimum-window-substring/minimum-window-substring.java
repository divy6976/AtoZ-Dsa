class Solution {
    public String minWindow(String s, String t) {


if(s.length() < t.length()){
 return "";
}
if(s.length()== 1 && t.length()==1){
    if(s.charAt(0) != t.charAt(0)){
        return "";
    }
}

        int count=t.length();

        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<t.length();i++){
            mpp.put(t.charAt(i),mpp.getOrDefault(t.charAt(i),0)+1);
        }

        int start=-1;
        int maxi=Integer.MAX_VALUE;
int end=-1;
        int k=0;
        int l=0;
        int r=0;

        while(r<s.length()){
            char ch=s.charAt(r);

            if(mpp.containsKey(ch) && mpp.get(ch) >0){
                count --;

            }
          
            mpp.put(ch,mpp.getOrDefault(ch,0)-1);

              if(count == 0){
                if(r-l+1 < maxi){
                    maxi=r-l+1;
                    start=l;
                    end=r;
                }

                while(count == 0){

                    if(r-l+1 < maxi){
                        maxi=r-l+1;
                     start=l;
                     end=r;
                    } 

                    mpp.put(s.charAt(l),mpp.getOrDefault(s.charAt(l),0)+1);
                    

                    if(mpp.get(s.charAt(l)) > 0){
                        count ++;

                      
                    }
                      
                    l++;

                  
                    
                }

            }
            r=r+1;
        }
if(start == -1 || end == -1){
    return "";
}
        return s.substring(start,end+1);
        
    }
}
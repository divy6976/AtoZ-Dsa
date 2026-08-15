class Solution {
    public String longestCommonPrefix(String[] strs) {

   Arrays.sort(strs,(a,b)->{
     return a.length()-b.length();
     });
     StringBuilder sb=new StringBuilder();

  String s=strs[0];
  for(int i=0;i<s.length();i++){
    boolean flag=false;
  
     for(int j=1;j<strs.length;j++){
        String part=strs[j];

        char ch=part.charAt(i);
         if(ch != s.charAt(i)){
           flag=true;
            
         }
    }

    if(flag){
        break;
    }else {
        sb.append(s.charAt(i));

    }

 }
   
   return sb.toString();

         
    }
}
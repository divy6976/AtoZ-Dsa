class Solution {
    public String largestOddNumber(String num) {

         int last=num.charAt(num.length()-1)-'0';
         if(last % 2 !=0){
            return num;
         }

   

      int i=0;
      int left=0;
     

   int j=num.length()-1;
   int right =-1;
   while(j>=0){
    char ch=num.charAt(j);

    int nums=ch-'0';
    if(nums % 2 !=0){
        right =j;
        break;
    }
    j--;
   }

   if(right == -1){
    return "";
   }
   if(left == right ){
   return num.substring(left,left+1);
   }

   return num.substring(left,right+1);

    
    }
}
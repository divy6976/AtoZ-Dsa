class Solution {


    void leftymax(int[] height,int[] lefty){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            if(height[i] > maxi){
                maxi=height[i];
lefty[i]=-1;
            }else{
                lefty[i]=maxi;
            }

        }

    }


    void rightmax(int[] height,int[] righty){


        int maxi=Integer.MIN_VALUE;

        for(int i=height.length-1;i>=0;i--){

            if(height[i] > maxi){
                maxi=height[i];
       righty[i]=-1;
            }else {
                righty[i]=maxi;
            }

        }




    }
    public int trap(int[] height) {


    int[] righty=new int[height.length];
    int[] lefty=new int[height.length];
        rightmax(height,righty);
        leftymax(height,lefty);
        int sum=0;
        for(int i=0;i<height.length;i++){

         if(righty[i] !=-1 && lefty[i]!=-1){
            sum += Math.min(lefty[i],righty[i]) - height[i];
         }

        }
        return sum;

    }
}
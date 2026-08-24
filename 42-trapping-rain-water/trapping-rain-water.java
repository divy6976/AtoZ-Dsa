class Solution {

    void lefty(int[] height,int[] leftmax){
  int maxi=-1;
  for(int i=0;i<height.length;i++){
    if(height[i] > maxi){
        maxi=height[i];
        leftmax[i]=-1;
    }else {
        leftmax[i]=maxi;
    }
  }
    }
    void righty(int[] height,int[] rightmax){
  
  int maxi=-1;
        for(int i=height.length-1;i>=0;i--){
if(height[i] > maxi){
    maxi=height[i];
    rightmax[i]=-1;
}else {
    rightmax[i]=maxi;
}
        }

    }
    public int trap(int[] height) {


        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];

        lefty(height,leftmax);
        righty(height,rightmax);


int sum=0;
for(int i=0;i<height.length;i++){
if(leftmax[i] !=-1 && rightmax[i]!=-1){
    sum += Math.min(leftmax[i],rightmax[i])-height[i];
}
}
        return sum;
    }
}
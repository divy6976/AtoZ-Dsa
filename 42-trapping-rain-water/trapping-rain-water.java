class Solution {

void righty(int[] height,int[] rightmax){
    int maxi=Integer.MIN_VALUE;
    for(int i=height.length-1;i>=0;i--){
        if(height[i] > maxi){
            rightmax[i]=-1;
            maxi=height[i];
        }else {
            rightmax[i]=maxi;
        }
    }
    
}
void lefty(int[] height,int[] leftmax){
    int maxi=Integer.MIN_VALUE;
    for(int i=0;i<height.length;i++){
        if(height[i]>maxi){
            leftmax[i]=-1;
            maxi=height[i];
        }else {
            leftmax[i]=maxi;
        }
    }
}

    public int trap(int[] height) {
int[] rightmax=new int[height.length];
int[] leftmax=new int[height.length];

 righty(height,rightmax);
 lefty(height,leftmax);
int sum =0;
 for(int i=0;i<height.length;i++){
if(rightmax[i]!=-1 && leftmax[i]!=-1){
    sum += Math.min(rightmax[i],leftmax[i]) - height[i];
}

 }
return sum;
    }
}
class Solution {

    void psee(int[] heights,int[] pse){
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();
            }
              if(st.isEmpty()){
                pse[i]=-1;
               
            }else {
                pse[i]=st.peek();
                

            }
            st.push(i);
    }
    }
    void nsee(int[] heights,int[] nse){
                Stack<Integer>st=new Stack<>();
  
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[i] <=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=nse.length;
               
            }else {
                nse[i]=st.peek();
                

            }
            st.push(i);
        }
    }
    public int largestRectangleArea(int[] heights) {

        int[] nse=new int[heights.length];
        int[] pse=new int[heights.length];


        nsee(heights,nse);
        psee(heights,pse);


        int maxi=0;

        for(int i=0;i<heights.length;i++){

         int breadth=0;
         breadth +=i-pse[i];
         breadth += nse[i]-(i+1);

         int area= breadth* heights[i];
         maxi=Math.max(maxi,area);



            
        }
        return maxi;
        
    }
}
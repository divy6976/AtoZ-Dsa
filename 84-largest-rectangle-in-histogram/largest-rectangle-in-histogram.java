class Solution {
    void nsee(int[] nse,int[] heights){

        Stack<Integer> st=new Stack<>();

        for(int i=heights.length-1;i>=0;i--){

            while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                st.pop();

            }

            if(st.isEmpty()){
                nse[i]=heights.length;
            }else {
                nse[i]=st.peek();
            }
            st.push(i);
        }

    }

    void psee(int[] pse,int[] heights){
        Stack<Integer> st=new Stack<>();

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


    public int largestRectangleArea(int[] heights) {

        int nse[]=new int[heights.length];
        int[] pse=new int[heights.length];

        nsee(nse,heights);
        psee(pse,heights);
        int maxi=0;

        for(int i=0;i<heights.length;i++){

            int width=nse[i]-pse[i]-1;
            int area=heights[i] * width;


            maxi=Math.max(maxi,area);

        }
        return maxi;
    }
}
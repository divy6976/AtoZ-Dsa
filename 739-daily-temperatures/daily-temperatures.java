class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] answer=new int[temperatures.length];

        Stack<Integer> st=new Stack<>();
        int nge[]=new int[temperatures.length];

        for(int i=temperatures.length-1 ;i>=0;i--){


            while(!st.isEmpty() && temperatures[i] >=temperatures[st.peek()]){

                st.pop();



            }

            if(st.isEmpty()){
                nge[i]=0;
                
            }else {
                nge[i]=st.peek();


            }
            st.push(i);
        

        }

        for(int i=0;i<answer.length;i++){
            if(nge[i]==0){
                answer[i]=0;
            }else {
                answer[i]=nge[i]-i;
            }
        }
        return answer;
    }
}
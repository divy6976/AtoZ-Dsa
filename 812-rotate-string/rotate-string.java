class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

        if(s.equals(goal)){
            return true;
        }

        int times=s.length()-1;

        while(times !=0){
            StringBuilder sb=new StringBuilder();

            for(int i=1;i<s.length();i++){
                sb.append(s.charAt(i));
            }
            sb.append(s.charAt(0));
            String check=sb.toString();
            if(check.equals(goal)){
                return true;
            }
            s=check;
            times--;
        }

        return false;
        


    }
}
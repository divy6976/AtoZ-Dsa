class Solution {
    public int candy(int[] ratings) {
        

        int hash[]=new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            hash[i]=1;
        }
for(int i=1;i<ratings.length;i++){
    if(ratings[i]>ratings[i-1]){
        hash[i]=hash[i-1]+1;
    }
    
}
for(int i= ratings.length-2;i>=0;i--){
    if(ratings[i]>ratings[i+1]){
      hash[i]=Math.max(hash[i],hash[i+1]+1);
    }
}
    // Step 4: Total sum calculate karo
    int sum = 0;
    for (int i = 0; i < hash.length; i++) {
        sum += hash[i];
    }

    return sum;

    }
}
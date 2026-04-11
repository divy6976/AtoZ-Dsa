class Solution {
       ArrayList<Integer> size=new ArrayList<>();
        ArrayList<Integer>  parent=new ArrayList<>();
    class DisjointSet{
     

     DisjointSet(int n){
            for(int i=0;i<n;i++){
                parent.add(i);
                size.add(1);
            }
        }

        int findparent(int node){
            if(parent.get(node) == node){
                return node;
            }
            int ulp=findparent(parent.get(node));
            parent.set(node,ulp);
            return ulp;
        }

        void unionbysize(int u,int v){
            int ulpu=findparent(u);
            int ulpv=findparent(v);

            if(ulpu == ulpv ) return ;
            if(size.get(ulpu) < size.get(ulpv)){
                parent.set(ulpu,ulpv);
                size.set(ulpv,size.get(ulpu)+size.get(ulpv));
            }else {
                parent.set(ulpv,ulpu);
                size.set(ulpu,size.get(ulpu)+size.get(ulpv));
            }
        }

    }
    public int makeConnected(int n, int[][] connections) {

        DisjointSet ds = new DisjointSet(n);
        int edges=0;


        for(int[] conn:connections){
            edges++;
            int u=conn[0];
            int v=conn[1];
            ds.unionbysize(u,v);

        }
        int cnt =0;

        for(int i=0;i<parent.size();i++){
            if(i==parent.get(i) ){
                cnt ++;
            }
        }

        if(edges  < n-1){
             return -1;
        }
        return cnt-1;

       



        
    }
}
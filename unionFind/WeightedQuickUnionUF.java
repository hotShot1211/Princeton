public class WeightedQuickUnionUF {
    private int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int num){
        this.id = new int[num];
        this.size = new int[num];
        for(int i = 0; i < num; i++){
            this.id[i] = i;
            this.size[i] = i;
        }
    }

    private int root(int i){
        while(this.id[i] != i){
            i = this.id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int rootp = root(p);
        int rootq = root(q);
        
        if(rootp == rootq){
            return;
        }

        if(this.size[rootp] < this.size[rootq]){
            this.id[rootp] = rootq;
            this.size[rootq] += this.size[rootp];
        }
        else{
            this.id[rootq] = rootp;
            this.size[rootp] += this.size[rootq];
        }
    }

}

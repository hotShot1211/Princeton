public class QuickUnionUF {
    private int id[];

    public QuickFindUF(int num){
        id = new int[num];
        for(int i = 0; i < num; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while(this.id[i] != i){
            i =  this.id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        if(connected(p, q)){
            System.out.println("already connected!");
            return;
        }
        int rootp = root(p);
        int rootq = root(q);
        id[rootp] = rootq;
    }
}

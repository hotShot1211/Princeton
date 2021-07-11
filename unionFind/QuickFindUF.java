public class QuickFindUF{
    private int[] id;
    public QuickFindUF(int num){
        this.id = new int[num];
        for(int i = 0; i < num; i++){
            this.id[i] = i;
        }
    }

    public boolean connected(int n, int m){
        return id[n] == id[m];
    }

    public void union(int p, int q){
        int pId = id[p];
        int qId = id[q];
        for(int i = 0; i < this.id.length; i++){
            if(id[i] == pId){
                id[i] = qId;
            }
        }
    }
}
public class client {
    public static void main(String[] args){
        WeightedQuickUnionUF qUF = new WeightedQuickUnionUF(10);
        qUF.union(0, 5);
        qUF.union(5, 6);
        qUF.union(1, 2);
        qUF.union(2, 7);
        qUF.union(3, 8);
        qUF.union(3, 4);
        qUF.union(4, 9);
        qUF.union(1, 6);
        qUF.union(0, 8);
        System.out.println(qUF.connected(0, 9));
    } 
}

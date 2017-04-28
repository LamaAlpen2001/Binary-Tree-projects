public class Zahlenbaum
{
    private BinaryTree<Integer> z1,z2,z3,z4,z5,z6,z7;

    public Zahlenbaum()
    {
     BinaryTree<Integer> z1 = new BinaryTree(7);
     BinaryTree<Integer> z2 = new BinaryTree(6, null, z1);
     BinaryTree<Integer> z3 = new BinaryTree(10);
     BinaryTree<Integer> z4 = new BinaryTree(11, z3, null);
     BinaryTree<Integer> z5 = new BinaryTree(9, z2, z4);
     BinaryTree<Integer> z6 = new BinaryTree(3);
     BinaryTree<Integer> z7 = new BinaryTree(5, z6, z5);
    }
    public void preOrderStart(){
        System.out.println("");
        preorder(z7);
    }
    public void preorder(BinaryTree<Integer> b){
        if(!b.isEmpty()){
            System.out.println(b.getContent()+" ");
        }
        if(!b.getLeftTree().isEmpty()){
            preorder(b.getLeftTree());
        }
        if(!b.getRightTree().isEmpty()){
            preorder(b.getRightTree());
        }
    }
}

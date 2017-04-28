public class Zahlenbaum
{
    private BinaryTree zahlenbaum;

    public Zahlenbaum()
    {
     BinaryTree<Integer> z1 = new BinaryTree(7);
     BinaryTree<Integer> z2 = new BinaryTree(6, null, z1);
     BinaryTree<Integer> z3 = new BinaryTree(10);
     BinaryTree<Integer> z4 = new BinaryTree(11, z3, null);
     BinaryTree<Integer> z5 = new BinaryTree(9, z2, z4);
     BinaryTree<Integer> z6 = new BinaryTree(3);
     BinaryTree<Integer> zahlenbaum = new BinaryTree(5, z6, z5);
    }
}

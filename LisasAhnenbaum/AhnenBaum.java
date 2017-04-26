public class AhnenBaum
{
    private BinaryTree lisasAhnenbaum;

    public AhnenBaum()
    {
        System.out.print("Danke, das sie sich führ diese Abbildung von Lisas Ahnenbaum von E&P.inc entschieden haben");
        BinaryTree<Ahne> jacAhnenbaum= new BinaryTree(new Ahne("Jacqueline", "Bouvier",'w'));
        BinaryTree<Ahne> claAhnenbaum= new BinaryTree(new Ahne("Clancy", "Bovier",'m'));
        BinaryTree<Ahne> monAhnenbaum= new BinaryTree(new Ahne("Mona", "Simpson",'w'));
        BinaryTree<Ahne> abrAhnenbaum= new BinaryTree(new Ahne("Abraham", "Simpson",'m'));
        BinaryTree<Ahne> marAhnenbaum= new BinaryTree(new Ahne("Marge", "Simpson",'w'),jacAhnenbaum,claAhnenbaum);
        BinaryTree<Ahne> homAhnenbaum= new BinaryTree( new Ahne("Homer", "Simpson",'m'),monAhnenbaum,abrAhnenbaum);
        BinaryTree<Ahne> lisasAhnenbaum= new BinaryTree(new Ahne("Lisa", "Simpson",'w'),marAhnenbaum,homAhnenbaum);
        
    }

}

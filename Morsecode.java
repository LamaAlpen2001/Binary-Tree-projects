public class Morsecode
{
    private BinaryTree<String> morsecodebaum;
    
    public Morsecode()
    {
        System.out.print("Danke, das sie sich für diese Implementation des Morsecodebaums von E&P.inc entschieden haben");
        BinaryTree<String> hBaum= new BinaryTree("H");
        BinaryTree<String> vBaum= new BinaryTree("V");
        BinaryTree<String> fBaum= new BinaryTree("F");
        BinaryTree<String> lBaum= new BinaryTree("L");
        BinaryTree<String> pBaum= new BinaryTree("P");
        BinaryTree<String> jBaum= new BinaryTree("J");
        BinaryTree<String> bBaum= new BinaryTree("B");
        BinaryTree<String> xBaum= new BinaryTree("X");
        BinaryTree<String> cBaum= new BinaryTree("C");
        BinaryTree<String> yBaum= new BinaryTree("Y");
        BinaryTree<String> zBaum= new BinaryTree("Z");
        BinaryTree<String> qBaum= new BinaryTree("Q");
        BinaryTree<String> sBaum= new BinaryTree("S", hBaum, vBaum);
        BinaryTree<String> uBaum= new BinaryTree("F", fBaum, null);
        BinaryTree<String> rBaum= new BinaryTree("L", lBaum, null);
        BinaryTree<String> wBaum= new BinaryTree("P", pBaum, jBaum);
        BinaryTree<String> dBaum= new BinaryTree("B", bBaum, xBaum);
        BinaryTree<String> kBaum= new BinaryTree("C", cBaum, yBaum);
        BinaryTree<String> gBaum= new BinaryTree("Z", zBaum, qBaum);
        BinaryTree<String> oBaum= new BinaryTree("O");
        BinaryTree<String> iBaum= new BinaryTree("I", sBaum, uBaum);
        BinaryTree<String> aBaum= new BinaryTree("A", rBaum, wBaum);
        BinaryTree<String> nBaum= new BinaryTree("N", dBaum, kBaum);
        BinaryTree<String> mBaum= new BinaryTree("M", gBaum, oBaum);
        BinaryTree<String> eBaum= new BinaryTree("E", iBaum, aBaum);
        BinaryTree<String> tBaum= new BinaryTree("T", nBaum, mBaum);
        BinaryTree<String> morsecodebaum= new BinaryTree("#", eBaum, tBaum);
    }
    
    public void morsezeichenDecodieren(BinaryTree b, String pCode)
    {
      int i = 0;    
      Stack<Character> s = new Stack<Character>();
      while(i< pCode.length()+1){
        s.push(CharAt(i));
        i++;
      }
      decodierer();
    }
    
    public void decodierer(){
      if(s.isEmpty()){
        return morsecodebaum.getContent(); 
       } 
      else{
       if(s.top() == '.'){
         s.pop();
         ausfuehren(morsecodebaum.getLeftTree());
       }
       if(s.top() == '_'){
         s.pop();
         ausfuehren(b.getRightTree);
       } 
      }
    }
}

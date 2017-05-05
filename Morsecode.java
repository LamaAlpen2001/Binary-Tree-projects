public class Morsecode
{
    private BinaryTree<String> morsecodebaum;
    private Stack<Character> s;
    
    public Morsecode()
    {
        System.out.print("Danke, dass sie sich für diese Implementation des Morsecodebaums von E&P.inc entschieden haben");
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
        morsecodebaum= new BinaryTree("#", eBaum, tBaum);
        Stack<Character> s = new Stack<Character>();
        
       }
    
    public void morsedecode(String pCode){
     System.out.println(decodierer(morsecodebaum, pCode));
    }   
    
    
    public String decodierer(BinaryTree<String> morsecodebaum, String pCode){
      if(pCode.length() == 0){
        return morsecodebaum.getContent(); 
       } 
      if(pCode.charAt(0) == '.'){
         return decodierer(morsecodebaum.getLeftTree(), pCode.substring(1));
      }
      else{
        return decodierer(morsecodebaum.getRightTree(), pCode.substring(1));
      } 
    }
    
     public void extendedDecodierer(String pCode){
       int i =0;
       int temp = 0;
       while(i< pCode.length()){
           if(pCode.charAt(i)==' '){
              System.out.print(decodierer(morsecodebaum, pCode.substring(temp,i)));
              temp = i+1;
           }
           i++;
       }  
    }
}

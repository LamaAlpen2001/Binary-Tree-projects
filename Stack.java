public class Stack<ContentType>
{
    private class StackNode{
    private ContentType content;
    private StackNode next;
    
    public StackNode(ContentType content)
    {
      this.content = content;
      next = null;
    }
    
    public void setNext(StackNode pnode){
     next = pnode;                                            
    }
    
    public StackNode getNext(){
      return next;
    }
    
    public ContentType getContent (){
      return content;
    }
   }
    
   private StackNode head;
   
    public Stack()
    {
     this.head = null;
    }
    
    public boolean isEmpty(){
     if(head == null){
       return true; 
      }
      else{
       return false;  
      }
    }
    
    public ContentType top(){
     if(!isEmpty()){
       return head.getContent();  
      }
      else{
       return null;
      }
    }
    
    public void pop(){
     if(!isEmpty()){
       head = head.getNext();  
      }
    }
    
    public void push(ContentType pContent){
     if(pContent != null){
        StackNode node = new StackNode(pContent);
        node.setNext(head);
        head = node;
       }
    }
}

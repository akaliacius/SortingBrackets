package bracketSorting;
import java.util.NoSuchElementException;

/**
 *
 * @author Andrius Kaliacius
 * 
 */


public class CharStack {
    private Node top = null;
    
    private class Node{
        private Character character;
        private Node next = null;
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    public void push(Character ch){
        Node newNode = new Node();
        newNode.character = ch;
        newNode.next = top;
        top = newNode;
    }
    
    public Character pop(){
        if(isEmpty())throw new NoSuchElementException("stack is empty");
        else{
            Node oldTop = top;
            Character result = top.character;
            if(top.next == null)top = null;
            else{
                top = top.next;
                oldTop.next = null;
            }
            return result;
        } 
    }
    
    public Character peek(){
        return top.character;
    }
    
}

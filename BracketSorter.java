package bracketSorting;

/**
 *
 * @author Andrius Kaliacius
 */

public class BracketSorter {
    private CharStack stack = new CharStack();
    
    
    public boolean areBracketsCorrect(String toSort){
        if(toSort == null || toSort.length() == 0 || toSort.length()%2 != 0) return false;
        for(int i = 0; i < toSort.length(); i++){
            compareBrackets(toSort.charAt(i));
        }
        return stack.isEmpty();
    }
    
    private void compareBrackets(Character bracket){
        if(bracket == '(' || bracket == '{' || bracket == '['){
            stack.push(bracket);
            return;
        }
        
        switch (bracket){
            case ')':
                if(stack.peek() == '(')stack.pop();
                else stack.push(bracket);
                break;
            
            case '}':
                if(stack.peek() == '{')stack.pop();
                else stack.push(bracket);
                break;
            
            case ']':
                if(stack.peek() == '[')stack.pop();
                else stack.push(bracket);
                break;
                
            default:
                stack.push(bracket);
        }
    }
}

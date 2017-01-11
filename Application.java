package bracketSorting;

/**
 *
 * @author Andrius Kaliacius
 */

public class Application {
    public static void main(String[] args){
        BracketSorter sorter = new BracketSorter();
        String correctBrackets = "({[]}){()()}()[][]";
        String wrongBrackets = "({[]}){()(()}()[)][]";
        
        System.out.println(correctBrackets + " is correct? " + sorter.areBracketsCorrect(correctBrackets));
        System.out.println(wrongBrackets + " is correct? " + sorter.areBracketsCorrect(wrongBrackets));
    }
}

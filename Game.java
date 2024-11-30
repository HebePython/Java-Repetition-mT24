import java.util.Deque;
import java.util.LinkedList;

public class Game {

    public static void main(String[] args) {
        
        Deque<Integer> NumberedPaperSlips = new LinkedList<>();

        NumberedPaperSlips.offerLast(1);
        NumberedPaperSlips.offerLast(2);
        NumberedPaperSlips.offerLast(3);
        NumberedPaperSlips.offerLast(4);

        System.out.println("Current number: " + NumberedPaperSlips.peekLast());

        NumberedPaperSlips.pollLast(); // removed last offered number first in first out

        System.out.println("Current number: " + NumberedPaperSlips.peekLast());

        NumberedPaperSlips.offerLast(5);

        System.out.println("Current number: " + NumberedPaperSlips.peekLast());

        System.out.println("\n=== Using as a stack ===");

        Deque<Integer> stack = new LinkedList<>();

        stack.offerFirst(1);
        stack.offerFirst(2);
        stack.offerFirst(3);
        stack.offerFirst(4);

        for(Integer i : stack){
            System.out.println(i);
        }
        
        System.out.println("First number: " + stack.peekFirst());
        System.out.println("Last number: " + stack.peekLast());

        System.out.println("I take first number number! " + stack.pollFirst()); // removed first offered number last in first out
        System.out.println("I also want this last number! " + stack.pollLast()); // removed last offered number first in first out
        
        System.out.println("First number: " + stack.peekFirst());
        System.out.println("Last number: " + stack.peekLast());
    
    }

}
 

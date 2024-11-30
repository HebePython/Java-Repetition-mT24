import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Arrays;

public class EvenMoreDemo {

    private ArrayList<Integer> numbers;

    public static void checkNumber() {

        
        
        int score = 85;

        char grade = switch (score / 10) {
            case 10, 9 -> 'A';  // 90-100
            case 8 -> 'B';      // 80-89
            case 7 -> 'C';      // 70-79
            case 6 -> 'D';      // 60-69
            default -> 'F';     // 0-59
        };
    System.out.println(grade);
    }

    public static void myQueue() {
        Queue<String> aQue = new LinkedList<>();

        aQue.offer("First!");
        aQue.offer("Second");
        aQue.offer("Third");

        System.out.println("lets poll this: " + aQue.poll());

        System.out.println("Lets peek: " + aQue.peek());
        System.out.println("lets poll this: " + aQue.poll());
        System.out.println("lets poll this: " + aQue.poll());

        // return aQue.isEmpty() ? "Is not empty" : "Is empty";
        if (aQue.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {System.out.println("Queue is not empty");}
    }

    public static void findCommonElements(int[] arr1, int[] arr2) {

        // compare elements in two arrays, elements that are equal gets added to new array. Iterate through them
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr2[i]) {
                temp.add(arr1[i]);
            }

        }
        int[] newArr = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            newArr[i] = temp.get(i);
        }

        for (int num : newArr) {
            System.out.println(num);
        }
    }

    public static void checkArrayElement(int[] arr) {

        try {
            int x = arr[20];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        
    }
    
    public static void stringLengthCheck() {


        Queue<MyStrings> myStringQueue = new PriorityQueue<MyStrings>();

        MyStrings s = new MyStrings("ok", "ok".length());
        MyStrings ss = new MyStrings("okok", "okok".length());
        MyStrings sss = new MyStrings("okokok" , "okokok".length());

        
        
        myStringQueue.offer(s);
        myStringQueue.offer(ss);
        myStringQueue.offer(sss);

        while (!myStringQueue.isEmpty()) {
            System.out.println(myStringQueue.poll());
        }  

    }
    public static void main(String[] args) {
        checkNumber();

        int[] numbers = {4, 8, 15, 16, 23, 42};
        int[] moreNumbers = {5, 15, 3, 23, 42, 100,};
        int temp;

        temp = numbers[0];
        try {
            for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds of the array!! OH NO!");
        }
        

        numbers[numbers.length - 1] = temp;
        for (int num : numbers) {System.err.println(num);}
        
 

        myQueue();

        findCommonElements(numbers, moreNumbers);

        checkArrayElement(numbers);
        System.out.println("Hey program is still running!");

        Queue<MyStrings> myStringQueue = new PriorityQueue<MyStrings>();

        MyStrings s = new MyStrings("ok", "ok".length());
        MyStrings ss = new MyStrings("okok", "okok".length());
        MyStrings sss = new MyStrings("okokok" , "okokok".length());

        
        
        myStringQueue.offer(s);
        myStringQueue.offer(ss);
        myStringQueue.offer(sss);

        while (!myStringQueue.isEmpty()) {
            System.out.println(myStringQueue.poll());
        }  

    }
}

class MyStrings {
    String s;
    int prioLvl;

    public MyStrings(String s, int prioLvl) {
        this.s = s;
        this.prioLvl = prioLvl;

    }

}

import java.util.ArrayList;

public class ListManager {
    private static ArrayList<Integer> numbers;
    public void addNumber(int number) {
    numbers.add(number);
    }

    public static int getSum() {
    int sum = 0;
    for(int num : numbers) {
    sum += num;
    }
    return sum;
    }

    public static void main(String[] args) {

        getSum();

        
    }
} 
        

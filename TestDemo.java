import java.util.LinkedList;
import java.util.Queue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;



public class TestDemo {

    public static Double calculateAverage(int[] arr) {

        if (arr == null || arr.length == 0) {return 0.0;}
        Double x = 0.0;
        int y = 0;

        for (int num : arr) {
            x += num;
            y++;
        }
        double avg = x / y;

        return avg;
    }

    public static String checkTemperature(double temp) {
        if (temp < 0) {
            return "Too cold";
        } else if (temp >= 0 && temp <= 25) {
            return "Normal";
        } else {
            return "Too hot";
        }  
    }

    public static void checkDivideByZero(int y) {

        int x = 5;
        try {
            x = x / y;
            System.out.print(x);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
            
        }
    }
    
    public static void main(String[] args) {
     
        
    int x = 21;
    int y = 5;

    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));

    System.out.println(checkTemperature(26)); 

    for (int i = 0; i <= 5; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    int[] numbers = {1, 2, 3, 4, 5}; // array of numbers.    

    for (int number : numbers) {
        if (number % 2 == 0) {
            System.out.println("Even: " + number);
        } else {System.out.println("Odd: " + number);}

    }
    Students student = new Students();

    System.out.println(student.getStatus());

    System.out.println(calculateAverage(numbers));
    int moreNumbers[] = {};
    System.out.println(calculateAverage(moreNumbers));

    checkDivideByZero(0);
    

    

    }
}


class Students {
    private String name;
    private int grade;
    private boolean isActive;

    public Students(String name, int grade, boolean isActive) {
        this.name = name;
        this.grade = grade;
        this.isActive = isActive;
    }

    public Students() {
        this.name = "New Student";
        this.grade = 1;
        this.isActive = true;

    }

    public String getStatus() {return getisActive() ?  "Active" : "Inactive";}

    public boolean getisActive() {
        return this.isActive;
    }

    public String getName() {
        return this.name;

    }
    public int getGrade() {
        return this.grade;
    }
    
}
// upg 11 & 12
class BankAccount {
    // Should be accessed by same class only. 
    private String accountID;
    // should only be accessed in this class since it is sensitive information more so than the AccountID.
    private double balance;
    // should be accessed in this class. 
    private double interest;

    public BankAccount(String accountID, double balance, double interest) {
        this.accountID = accountID;
        this.balance = balance;
        this.interest = interest;
    }

    public BankAccount() {
        this.accountID = "DEFAULT";
        this.balance = 100.0;
        this.interest = 0.01;
    }

}

// Upg 13. When to use static. when a variable should be used with the same value among all instances. 
// For a method: Global methods that should keep the same function everywhere that doesnt depend on instanced variables.

// 14
/*Select the correct statement about the 'private' access modifier:
 A. It allows access from any class in the same package
 B. It allows access only within the same class
 C. It allows access from any subclass
 D. It allows access from any class in any package
 Correct is B! */

 abstract class Animal {
    private String species;
    private int age;

    public Animal (String species, int age) {
        this.species = species;
        this.age = age;
    }

    abstract void makeSound();

 }

 class Fish extends Animal {

    public Fish() {
        super("Fishy", 12);
    }
    // Method overriding, replaces the original method in the superclass with 
    // a specific method with its own behavior & variables tied to the subclass
    @Override
    void makeSound() {
        System.out.println("Fish sound");

    }

 }
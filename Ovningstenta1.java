import java.nio.file.FileAlreadyExistsException;

public class Ovningstenta1 {

    public static int findHighest(int[] arr) {

        if (arr.length < 1 || arr == null) {return -1;}
        int highestNum = 0;

        for (int num : arr) {
            if (highestNum < num) {
                highestNum = num;
            } 
        }

        return highestNum;
    }

    public static void main(String[] args) {

        try {int x = 0 / 0;} catch (ArrayIndexOutOfBoundsException e) {}
        
        int[] someNums = {};

        System.out.println(findHighest(someNums));

        for (int i = 0; i < 10; i++) {
            System.out.println(i += ++i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i += i++);
        }

        System.out.println(validateAge(0));

        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }

        String[] days = {"Monday", "Sunday"};

        for (String day : days) {
            if (day.startsWith("s") || day.startsWith("S")) {System.out.println(day);}
        }
    }

    public static boolean validateAge(int age) {
        if (age > 0 && age <= 120) {
            return true;
        } else {
            return false;
        }
    }
    
}

class Book {
    private String title;
    private int pageCount;
    private boolean isDigital;

    public Book(String title, int pageCount, boolean isDigital) {
        this.title = title;
        this.pageCount = pageCount;
        this.isDigital = isDigital;
    }

    public Book() {
        this.title = "Default";
        this.pageCount = 100;
        this.isDigital = false;
    }

    public static String getFormat(boolean isDigital) {
        if (isDigital) {
            return "Digital";
        } else { return "PHysical";

    }
    }


}

class Account {
    private int accountNumber;
    private double balance;
    private String accountType;
    
    // Since it has to do with a bank account, all these are sensitive information.
    // Should be restricted from where (in the code) one can access it. 

    public Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public Account() {
        this.accountNumber = 000000;
        this.balance = 0.0;
        this.accountType = "Savings";
    }
}


class Calculator {

    // method overloading, useful to use a method with same for a simple concept like add(). But you can have different
    //versions of it with different parameters or in different order if they are of different types.
    // compile-type polymorphism concept. 
    public int add(int y, int x) {
        return y + x;
    }

    public int add(int y, int x, int z) {
        return y + x +z;
    }

    public int add(int y, int x, int z, int i) {
        return y + x + z + i;
    }
    
    
}

abstract class Vehicle {
    protected String type;
    protected int wheels;


    public abstract void startEngine();

    }

class Bicycle extends Vehicle {
    public void startEngine() {
    System.out.println("Bicycles don't have engines!");


    }
}

class MusicTrack implements Playable {
    protected String artist;

    public void play() {
        System.out.println("Plays next track");
    }

    public void pause() {
        System.out.println("Pauses current track");
    }

    public String getArtist() {
        return artist;
    }
}

class VideoClip implements Playable {

    public void play() {
        System.out.println("Plays video");
    }

    public void pause() {
        System.out.println("Pauses video");
    }

    public void printScreen() {
        System.out.println("Here is a printscreen file from the video");

    }
}

abstract class Shape {
    protected double area;
    public abstract double calculateArea();
}

class Square extends Shape {
    protected double height;
    protected double length;

    public Square(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return height * length;
    }
    
}
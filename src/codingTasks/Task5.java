package codingTasks;

public class Task5 {
    public static void main(String[] args) {
        // Write a program to swap 2 numbers without a
        //temporary variable?
        int num1=10;
        int num2=20;
        System.out.println("Before");
        System.out.println("num1= "+ num1);
        System.out.println("num2= "+ num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After");
        System.out.println("num1= "+ num1);
        System.out.println("num2= "+ num2);

    }
}

package codingTasks;

public class Task2 {
    public static void main(String[] args) {
        // Create an array of integer values. After the array is
        //created, calculate the sum of all stored elements in
        //that array.
        int sum=0;
        int [] numbers={10,12,15,32,45,3};
        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];
        }
        System.out.println(sum);

    }
}

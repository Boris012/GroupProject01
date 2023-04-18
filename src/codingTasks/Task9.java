package codingTasks;

public class Task9 {
    public static void main(String[] args) {
        // Write a java program to find the second largest
        //number in the array?
        int [] numbers = {1,4,32,16,22,46,33,77,11};
        int larg=numbers[0];
        int secLarg=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>larg) {
                secLarg = larg;
                larg = numbers[i];
            }else if (numbers[i]>secLarg){
                secLarg=numbers[i];
            }

        }
        System.out.println("the second largest number is "+ secLarg);
    }
}

package codingTasks;

public class Task1 {
    public static void main(String[] args) {
        // Create a program that uses an array to store a list of
        //temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.
        int [] wTemp={23, 28, 15,-3,1, 34};
        int high = wTemp[0];
        int low = wTemp[0];

        for (int i = 0; i < wTemp.length; i++) {
            if (wTemp[i] >high){
                high = wTemp[i];
            }else if (wTemp[i] <low){
                low = wTemp[i];
            }

        }
        System.out.println("The highest temp is " + high);
        System.out.println("The lowest temp is " + low);
    }
}

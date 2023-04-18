package codingTasks;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int []num={16,24,4,54,11,17,66};
        int max=num[0];
        int min=num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }else if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Maximum number in the array is "+ max);
        System.out.println("Minimum number in the array is "+ min);
    }
}

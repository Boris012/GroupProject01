package codingTasks;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program
       // which will calculate the sum of even and odd numbers
       // for that array.
        int [][] numbers= {
                {10,20,33,5,16},
                {1,21,34,55,6},
                {11,23,43,15,14}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven+=numbers[i][j];
                }else if(numbers[i][j]%2!=0){
                    sumOdd +=numbers[i][j];
                }

            }

        }
        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("The sum of odd numbers is " + sumOdd);
    }
}

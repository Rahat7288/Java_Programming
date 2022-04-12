import java.util.Scanner;

public class javaClass {
    public static void main(String[] args) {

        System.out.println("array is a collaection of same type of veriable");

        int[] numbers;

        numbers = new int[4];


        numbers[0] = 4;
        numbers[1] = 6;
        numbers[2] = 9;
        numbers[3] = 10;

        int sum = numbers[0]+numbers[1]+numbers[2]+numbers[3];

        System.out.println("sum of the numbers are: "+ sum);

        Scanner snr = new Scanner(System.in);

        int number;
        System.out.println("Enter a number :");

        number = snr.nextInt();
        

        System.out.println(number);
        

        
        
    }
    
}

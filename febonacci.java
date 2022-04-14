import java.util.Scanner;

public class febonacci {
    public static void main(String[] args) {
        System.out.println("febonacci numbers");

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the max number: ");

        int number = scanner.nextInt();

        int fibPrevious = 0, fibonacci = 1, sum =0;

        for (int i = 1; i <= number; i++){
            System.out.print(fibPrevious+ " ");
            sum = fibPrevious + fibonacci;
            fibPrevious = fibonacci;
            fibonacci = sum;
        }


        
    }
    
}

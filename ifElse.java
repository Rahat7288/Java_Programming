import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("if else statements in java ");

        Scanner scanner = new Scanner(System.in);


        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("ood number ");
        }

        scanner.close();
        
    }
    
}

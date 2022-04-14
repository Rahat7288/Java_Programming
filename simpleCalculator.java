import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println("simple claculator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter two numbers:");
        System.out.print("Enter 1st number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.println("Choose an operator (+,-,*,/) : ");
        char opertor = scanner.next().charAt(0);

        double result = 0.0;

        switch (opertor){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("invalid operator");
                break;


        }
        System.out.println("your result is "+ result);
        scanner.close();
    }
    
}

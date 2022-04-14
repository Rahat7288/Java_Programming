import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        System.out.println("method in java");
        Scanner scanner = new Scanner(System.in);

        int input1,input2,sum,minimum;
        System.out.print("Enter the first number: ");
        input1 = scanner.nextInt();
        System.out.print("Enter the second nomber");
        input2 = scanner.nextInt();

        Show(input1, input2);

        sum = add(input1, input2);
        System.out.println("summetion of the numbers are: "+ sum);
        minimum = min(input1, input2);
        System.out.println("showhing the minimum number: "+ minimum);

    }

    //out side the main body 
    //this function will show the two input number 
    public static void Show (int num1, int num2){
        System.out.println("you have entered : " + num1 + "and" + num2);
    }

    //sum of the two input number 
    public static int add(int num1, int num2){
        int sum = 0;
        sum = num1 + num2;
        return sum;

    }
    //
    
    //returns the minimum number
    
    public static int min (int num1, int num2){
        int min;
        if(num1 > num2)
            min = num2;
        else
            min = num1;
        return min;
    }
    
}
  
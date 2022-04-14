public class loops {
    public static void main(String[] args) {
        System.out.println("loop in java programming");

        //=========for loop=======
        //
        //
        /*
        int i,sum;
        sum = 0;
        for(i= 0 ;i <=5; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum of the number :"+ sum);
        */
        //=================
        //
        //

        //for each loop (another form of loop to work with arrays and collections)
        char[] letters = {'h','e','l','l','o'};

        for (char item: letters){
            System.out.println(item);
        }


        //
        //another example of for each loop 

        int[] numbers = {3,5,7,9,3,2};
        int sum=0;

        for (int num : numbers){
            sum += num;
            System.out.println(num);

        }
        System.out.println(sum);


    }
    
}

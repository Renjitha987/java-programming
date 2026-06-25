import java.util.Scanner; //// Import Scanner class for user input

public class OddEven {
    public static void main(String[] args){

        //// Create Scanner object to read input from keyboard
        Scanner Sc =new Scanner(System.in);
        // Ask the user to enter a number
        System.out.print("enter the number");
        // Read the integer entered by the user
        int num= Sc.nextInt();
        // Check whether the number is divisible by 2
        if (num%2==0)
            // Executed if the remainder is 0 (even number)
        System.out.print("number is even");
        else
            System.out.print("number is odd");

    }
}

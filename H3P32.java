import java.util.Scanner;
/**
 * @author Deepali Juneja
 * @version 31 January 2020
 */

public class H3P32{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number to get its factorial: ");
        int n = keyboard.nextInt();
        System.out.println("The factorial of "+ n +" is: " + factorial(n)); // any time the user inputs numbers after 63, the return value given is a negative number or a zero.
    }

    public static long factorial(long n){
        long factorial = 1;
        if(n >= 0 && n < 101){
            if(n == 0){
                factorial = 1;
            }else{
                for(long i = 1; i <= n; i++){
                    factorial *= i;
                    factorial = Math.abs(factorial);//because large data types create negative numbers
                }
            }
        }
        else{
            factorial = -1;
        }
        return factorial;
    }

}
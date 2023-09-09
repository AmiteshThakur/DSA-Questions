import java.util.*;
/*Ques: Given the number of value in the input then insert a number , you have to print the whether the number is prime or non prime number. */ 




/* To find the optimal code to find whether the number is prime or not , we have to remember few points 
 * 1 is not a prime number.
 * 2 is the smallest prime number  that's why we started our first second loop form 2.
 * if the number is divisible by any number then it's first divisor is between 2 to the root of that number , so we use this concept in our second loop and run it form 2 to root of that number , or j<= roont(number) or j*j<=number
 */

class PrimeNumber {
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the number of values : ");
    int values=scanner.nextInt();

    for(int i=0; i<values; i++){
        int number =scanner.nextInt();
        int count=0;
        
        for(int j=2; j*j<=number; j++)
        {
            if(number%j==0)
            {
                count++;
            break;
            }
        }

        if(count==0 && number!=1)System.out.println("Prime");
        else System.out.println("Not Prime");

    }
scanner.close();
}
  }
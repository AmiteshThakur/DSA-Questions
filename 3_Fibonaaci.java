/*Ques: In this question we have to print the fibonacci series upto the given no. of times.
 * 
 */



 /*In this solution we solve fibonacci series with the help of loop. In this we take two varible  firstValue and secondValue to inatilize the starting two values of the fibonaaci series then move the numbers by next position by making the firstValue as equal to secondValue and make a secondValue the sum of the two values..
 
  */
import java.util.Scanner;
class Fibonaaci {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int value= scanner.nextInt();
    int firstValue=0; 
    int secondValue=1;
    for(int i=0; i<value; i++){
       
        System.out.println(firstValue);
        secondValue=firstValue+secondValue;
        firstValue=secondValue-firstValue;

    }
    scanner.close();

}    
}

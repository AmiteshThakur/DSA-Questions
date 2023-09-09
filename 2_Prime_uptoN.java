/*Ques: We have to find the Prime Numbers in between the given range , the range is given by two numbers one is lower limit and the other is upper limit.. we have to print all the prime numbers within the range.. */

import java.util.Scanner;
class Prime_Number{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lower limit: ");
     int i=  scanner.nextInt();
        System.out.println("Upper Limit: ");
        int higherLimit=scanner.nextInt();
    for( ; i<=higherLimit; i++)
{   int count=0;
    for(int j=2 ; j*j<=i; j++){
        if(i%j==0){
            count++;
            break;
        }
    }
    if(count==0 && i!=1){
        System.out.println(i);

    }

}

        
    }
}
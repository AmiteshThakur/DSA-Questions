import java.util.Scanner;
class fibonacci_RECURSION
{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int value=scanner.nextInt();
        scanner.close();        
        for(int i=0; i<value; i++)
        {
           System.out.println( fibonacciNumber(i));

        }
    }
    private static int fibonacciNumber(int number){
        if(number==0)return 0;
        else if(number==1 || number==2) return 1;

        return fibonacciNumber(number-1)+fibonacciNumber(number-2);
    }
}
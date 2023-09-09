import java.util.HashMap;
import java.util.Map;
import java.util.*;
 class Fibonacci_Memorization {
static private Map<Integer, Integer> memorizationMap = new HashMap<>();
private static int fibonacciNumber(int number){
    if(number==0)return 0;
    else if(number==1 || number==2)return 1;
    else if(memorizationMap.containsKey(number)){
        return memorizationMap.get(number);
    }
    int result = fibonacciNumber(number-1)+fibonacciNumber(number-2);

    memorizationMap.put(number, result);
    return result;
}   
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the value: ");
    int value= scanner.nextInt();
    scanner.close();
    for(int i=0 ; i<value; i++){
        System.out.println(fibonacciNumber(i));

    }

}
}

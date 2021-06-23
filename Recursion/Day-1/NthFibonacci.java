import java.util.*;

class NthFibonacci {
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else if (n >= 2) {
            return (Fibonacci(n - 1) + Fibonacci(n - 2));
        }
        else {
            return -1;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, n = 0;
        System.out.print("n = ");
        n = sc.nextInt();
        int result = Fibonacci(n - 1);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
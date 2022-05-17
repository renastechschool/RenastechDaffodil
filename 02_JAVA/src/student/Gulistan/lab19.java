package student.Gulistan;
//Write a return method that returns the  Fibonacci of any given number
public class lab19 {

        static int fibo(int n){
            int f[] = new int[n+2]; // 1 extra to handle case, n = 0
            int i;

            f[0] = 0;
            f[1] = 1;

            for (i = 2; i <= n; i++) {
               f[i] = f[i-1] + f[i-2];
            }

            return f[n];
        }

        public static void main (String args[]){
            int n = 5;
            System.out.println(fibo(n));
        }
    }
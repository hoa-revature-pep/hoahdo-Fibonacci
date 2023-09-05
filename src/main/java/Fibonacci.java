import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){
        /**
         * n: 0  1  2  3  4  5  6  7  8  9  10 11
         * f: 0  1  1  2  3  5  8  13 21 34 55 89
         */
        List<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0);
        fibo.add(1);

        for (int i = 2; i <= n; i++) {
            fibo.add(i, (fibo.get(i-1) + fibo.get(i-2)));
        }

        return fibo.get(n);
    }
}

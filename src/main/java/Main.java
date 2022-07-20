import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
    /**
     *  Does stuff
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        List<Long> nums = new ArrayList<Long>();
        for (long x = 2; x * x <= number; x ++){
            nums.add((Long) x);
        }
        return !nums.stream().anyMatch((x) -> number % x == 0);
    }
}

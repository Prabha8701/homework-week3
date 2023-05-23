package homework;

import java.util.Scanner;

public class OddEven1 {
    /**
     * a java program that tells us that Input number is odd or even?
     */
    public void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int x = sc.nextInt();
        System.out.println(!(x % 2 == 0) ? "Odd Number" : "Even Number");
        sc.close();
    }
    public static void main(String[] args) {
        OddEven1 obj = new OddEven1();
        obj.oddEven();
    }
}

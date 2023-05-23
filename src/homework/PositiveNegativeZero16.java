package homework;

import java.util.Scanner;

public class PositiveNegativeZero16 {
    public void pnz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Number is Positive");
        } else if (x < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is 0");
        }
    }
    public static void main(String[] args) {
        PositiveNegativeZero16 obj = new PositiveNegativeZero16();
        obj.pnz();
    }
}

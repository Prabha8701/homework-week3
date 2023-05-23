package homework;

import java.util.Scanner;

public class SumOfValueArray18 {
    public void ns() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the numeric array: ");
        int numSize = scanner.nextInt();
        int[] numericArray = new int[numSize];
        int sum=0;
        System.out.println("Enter the elements of the numeric array:");
        for (int i = 0; i < numSize; i++) {
            numericArray[i] = scanner.nextInt();
            sum= sum+numericArray[i];
        }
        scanner.close();
            System.out.println("Sum value of Array :" +sum );
    }
    public static void main(String[] args) {
        SumOfValueArray18 obj=new SumOfValueArray18();
        obj.ns();
    }
}

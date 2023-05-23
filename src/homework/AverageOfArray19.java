package homework;

import java.util.Scanner;

public class AverageOfArray19 {
    public void ns() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the numeric array: ");
        int numSize = scanner.nextInt();
        int[] numericArray = new int[numSize];
        int sum=0;
        int avg=0;
        System.out.println("Enter the elements of the numeric array:");
        for (int i = 0; i < numSize; i++) {
            numericArray[i] = scanner.nextInt();
            sum= sum+numericArray[i];
            avg= sum/numSize;
        }
        scanner.close();
        System.out.println("Average value of Array :" +avg );
    }
    public static void main(String[] args) {
        AverageOfArray19 obj=new AverageOfArray19();
        obj.ns();
    }
}

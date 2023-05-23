package homework;

import java.util.Scanner;

public class FindOddEven6 {
    public void oe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int y= sc.nextInt();
        if (y % 2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        FindOddEven6 obj= new FindOddEven6();
        obj.oe();
    }
}

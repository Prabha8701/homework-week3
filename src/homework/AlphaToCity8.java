package homework;

import java.util.Scanner;

public class AlphaToCity8 {
    public void ac() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Uppercase Alphabet :");
        String af = sc.next();
        sc.close();
        if (af.equals("A")) {
            System.out.println("Amersham");
        } else if (af.equals("B")) {
            System.out.println("Bath");
        } else if (af.equals("C")) {
            System.out.println("Chelthnham");
        } else if (af.equals("D")) {
            System.out.println("Dover");
        } else if (af.equals("E")) {
            System.out.println("Edinburgh");
        } else if (af.equals("F")) {
            System.out.println("Farnborough");
        } else {
            System.out.println("Invalid Alphabet");
        }
    }
    public static void main(String[] args) {
        AlphaToCity8 obj=new AlphaToCity8();
        obj.ac();
    }
}

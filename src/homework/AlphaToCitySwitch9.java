package homework;

import java.util.Scanner;

public class AlphaToCitySwitch9 {
    public void sw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Uppercase Alphabet :");
        String af = sc.next();
        sc.close();
        switch (af){
            case "A":
                System.out.println("Amersham");
                break;
            case "B":
                System.out.println("Bath");
                break;
            case "C":
                System.out.println("Chelthnham");
                break;
            case "D":
            System.out.println("Dover");
            break;
            case "E":
            System.out.println("Edinburgh");
            break;
            case "F":
            System.out.println("Farnborough");
            break;
            default:
            System.out.println("Invalid Alphabet");
        }
    }
    public static void main(String[] args) {
        AlphaToCitySwitch9 obj=new AlphaToCitySwitch9();
        obj.sw();
    }
}

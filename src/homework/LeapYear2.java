package homework;

import java.util.Scanner;

public class LeapYear2 {
    /**
     * a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */
    public void ly(){
        Scanner lp = new Scanner(System.in);
        System.out.println(" Enter any year: ");
        int year = lp.nextInt();
        lp.close();
        if(year % 4 ==0){
            System.out.println(" Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        LeapYear2 obj = new LeapYear2();
        obj.ly();
    }
}

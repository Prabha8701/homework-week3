package homework;

public class DivisibleBy3511 {
    public void diVi3() {
        System.out.println("Number Divisible by 3 : ");
        for (int x = 1; x < 100; x++) {
            if (x % 3 == 0) {
                System.out.print(+x + ",");
            }
        }
    }
    public void diVi5(){
        System.out.println("Numbers Divisible by 5 : ");
        for (int x = 1; x < 100; x++) {
            if (x % 5 == 0) {
                System.out.print(+x + ",");
            }
        }
    }

    public static void main(String[] args) {
        DivisibleBy3511 obj = new DivisibleBy3511();
        obj.diVi3();
        obj.diVi5();
    }
}



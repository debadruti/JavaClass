import java.util.Scanner;

class func {
    int addition(int x, int y, int z) {
        return x + y - z;
    }
}

public class task {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

        func r = new func();

        System.out.println("Result is : " + r.addition(a, b, c));

        sc.close();
    }
}
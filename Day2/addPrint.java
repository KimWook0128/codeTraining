package Day2;

import java.util.Scanner;

public class addPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((1 <= a && a <= 100) && (1 <= b &&b <= 100)) {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        sc.close();
    }
}

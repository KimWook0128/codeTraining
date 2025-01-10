package Day1;

import java.util.Scanner;

public class forPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        boolean result1 = (1 <= str.length()) && (str.length() <= 10);
        boolean result2 = (1 <= n) && (n <= 5);
        if (result1 && result2) {
            for(int i = 0; i < n; i++) {
                System.out.print(str);
            }
        }
        else {
            return;
        }
        sc.close();
    }
}

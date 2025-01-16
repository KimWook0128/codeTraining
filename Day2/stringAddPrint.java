package Day2;

import java.util.Scanner;

public class stringAddPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if ((1 <= a.length() && a.length() <= 10) && (1 <= b.length() && b.length() <= 10)) {
            StringBuilder sb1 = new StringBuilder();

            sb1.append(a);
            sb1.append(b);

            String result = sb1.toString();
            System.out.println(result);
        }

        sc.close();
    }
}

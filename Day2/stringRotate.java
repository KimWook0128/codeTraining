package Day2;

import java.util.Scanner;

public class stringRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(1 <= a.length() && a.length() <= 10) {
            String[] spells = a.split("");
            for(int i = 0; i < spells.length; i++) {
                System.out.println(spells[i]);
            }
        }
        sc.close();
    }
}

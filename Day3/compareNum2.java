package Day3;

public class compareNum2 {
    class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            if (1 <= a && 1 <= b && a <= 10000 && b <= 10000) {
                int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
                int result2 = 2 * a * b;
                if (result1 <= result2) {
                    answer = result2;
                }
                else {
                    answer = result1;
                }
            }
            return answer;
        }
    }
}

package Day3;

public class compareNum {
    class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            if (1 <= a && a <= 10000 && 1 <= b && b <= 10000) {
                int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
                int result2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
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

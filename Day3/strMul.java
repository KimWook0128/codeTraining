package Day3;

public class strMul {
    class Solution {
        public String solution(String my_string, int k) {
            String answer = "";
            if (1 <= my_string.length() && my_string.length() <= 100
                    && my_string.equals(my_string.toLowerCase()) && 1 <= k && k <= 100) {
                for (int i = 0; i < k; i++) {
                    answer = answer + my_string;
                }
            }
            return answer;
        }
    }
}

package Day3;

public class stringMix {
    class Solution {
        public String solution(String str1, String str2) {
            String answer = "";
            if (1 <= str1.length() && str1.length() == str2.length() && str2.length() <= 10
                    && str1.equals(str1.toLowerCase()) && str2.equals(str2.toLowerCase())) {
                for (int i = 0; i < str1.length(); i++) {
                    char a = str1.charAt(i);
                    char b = str2.charAt(i);
                    answer = answer + a + b;
                }
            }
            return answer;
        }
    }
}

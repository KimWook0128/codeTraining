package Day2;

public class stringOverwrite {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        if (1 <= overwrite_string.length() && overwrite_string.length() <= my_string.length() && my_string.length() <= 1000) {
            if (0 <= s && s <= (my_string.length() - overwrite_string.length())) {
                String front = my_string.substring(0, s);
                String back = my_string.substring(s + overwrite_string.length());
                answer = front + overwrite_string + back;
            }
        }
        return answer;
    }
}

package Leetcode;

public class leetcode_8 {
    public int myAtoi(String s) {
        int ans = 0;
        int i = 0;
        boolean isNeg = false;
        s = s.trim();
        if (s.length() == 0)
            return 0;
        else if (s.charAt(i) == '-') {
            isNeg = true;
            i++;
        } else if(s.charAt(i)=='+'){
            i++;
        }
            while (i < s.length()) {
                int num = s.charAt(i) - '0';
                if (num >= 0 && num <= 9) {
                    if (ans > (Integer.MAX_VALUE - num) / 10) {
                        return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    ans = ans * 10 + num;
                } else {
                    break;
                }
                i++;
            }

        return isNeg ? ans * -1 : ans;
    }
}

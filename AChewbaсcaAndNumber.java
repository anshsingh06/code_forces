import java.util.*;

public class AChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            // The first digit cannot become 0
            if (i == 0 && digit == 9) {
                ans.append(9);
            } else {
                ans.append(Math.min(digit, 9 - digit));
            }
        }

        System.out.println(ans);
    }
}
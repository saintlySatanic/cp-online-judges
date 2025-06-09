import java.util.Scanner;

public class ElementaryOps {
    static String reverse(String s) {
        String reversedStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedStr += s.charAt(i);
        }

        return reversedStr;
    }

    static int charToInt(char c) {
        return c - '0';
    }

    static int intToChar(int i) {
        return (char) i;
    }

    static String addition(String a, String b) {
        // by default all packages of java.lang can be used without explicit import
        StringBuilder sb = new StringBuilder("");

        String aRev = reverse(a);
        String bRev = reverse(b);

        int loopLen = Math.min(a.length(), b.length());
        int carry = 0;
        for(int i=0; i<loopLen; i++) {
            int sum = charToInt(a.charAt(i)) + charToInt(b.charAt(i)) + carry;

            if (sum >= 10) {
                // sum of 2 digits cannot exceed 19 (9+9+1(carry))
                sb.append(intToChar(sum % 10));
                carry = 1;
            } else {
                sb.append(intToChar(sum));
                carry=0;
            }
        }

        // processing the remaining string of either a or b
        if (a.length() > loopLen) {
            for(int i=loopLen; i<a.length(); i++) {
                int sum = charToInt(a.charAt(i)) + carry;
                if (sum >= 10) {
                    // sum of 2 digits cannot exceed 19 (9+9+1(carry))
                    sb.append(intToChar(sum % 10));
                    carry = 1;
                } else {
                    sb.append(intToChar(sum));
                    carry=0;
                }
            }
        } else {
            for(int i=loopLen; i<b.length(); i++) {
                int sum = charToInt(b.charAt(i)) + carry;
                if (sum >= 10) {
                    // sum of 2 digits cannot exceed 19 (9+9+1(carry))
                    sb.append(intToChar(sum % 10));
                    carry = 1;
                } else {
                    sb.append(intToChar(sum));
                    carry=0;
                }
            }
        }

        // carry can be there in the last :: Also carry can never be > 1
        if (carry > 0) sb.append('1');

        return sb.reverse().toString();
    }

    static String subtraction(String a, String b) {
        return "";
    }

    static String multiplication(String a, String b) {
        return "";
    }

    static String divison(String a, String b) {
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.err.printf("Addition of %s and %s is %s \n", a, b, addition(a, b));
    }
}
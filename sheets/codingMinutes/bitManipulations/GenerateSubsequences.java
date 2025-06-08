import java.util.Scanner;


public class GenerateSubsequences {
    static String applyNumberMask(String s, int n) {
        // ArrayList<Character> res = new ArrayList();
        StringBuilder sb = new StringBuilder();

        int pos=0;
        while(n>0) {
            if ((n&1) !=0 )sb.append(s.charAt(pos));
            n>>=1;
            pos++;
        }
        // return res.toString();
        return sb.toString();
    }

    static String[] generateStrings(String s) {
        int len = s.length();
        String[] subStrings = new String[1<<len];
        
        for(int i=0; i<1<<len; i++) {
            subStrings[i] = applyNumberMask(s, i);
        }

        return subStrings;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] subStrings = generateStrings(n);

        for(String s: subStrings) System.err.println(s);
    }
}
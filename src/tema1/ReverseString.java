package tema1;

public class ReverseString {
    public static void main(String[] args) {
        String inp = "mere";
        System.out.println(reverseString2(inp));
    }

    public static String reverseString(String original) {
        int len = original.length();
        String reversed = "";
        for (int i = 0; i < len; i++) {
            char crt = original.charAt(len - i - 1);
            reversed = reversed + crt;
        }
        return reversed;
    }

    public static String reverseString2(String original) {
        int len = original.length();
        String reversed = "";
        for (int i = len -1; i >= 0; i--) {
            char crt = original.charAt(i);
            reversed = reversed + crt;
        }
        return reversed;
    }
}

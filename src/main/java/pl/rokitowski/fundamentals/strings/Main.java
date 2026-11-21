package pl.rokitowski.fundamentals.strings;

public class Main {

    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s){
        return s.equalsIgnoreCase(reverse(s));
    }

    static void main(String[] args) {
        String s = "abc";
        String s2 = "kajak";

        IO.println(reverse(s));
        IO.println(isPalindrome(s));
        IO.println(isPalindrome(s2));

        long start = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("x");
        }
        long ms = (System.nanoTime() - start) / 1_000_000;

        IO.println(ms);

        String a = "java";
        String b = "java";
        String c = new String("java");
        String d = c.intern();

        IO.println(a == b);
        IO.println(a == c);
        IO.println(a.equals(c));
        IO.println(a == d);
    }
}


package java_fundmental;

public class Reverse {
    public String reverse(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }
        System.out.println("mid" + str);
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(new Reverse().reverse("ABCD"));
    }
}

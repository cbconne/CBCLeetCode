public class FindtheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("aa", "aaa"));
    }

    public static char findTheDifference(String s, String t) {
        int i = 0;
        for (char a : t.toCharArray()) {
            i += a;
        }
        for (char a : s.toCharArray()) {
            i -= a;
        }
        return (char) i;
    }
}

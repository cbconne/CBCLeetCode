public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(is_Subsequence("adsf", "afgsdssar"));
        is_Subsequence("adsf", "afgsdssar");
    }

    public static boolean is_Subsequence(String s, String t) {
        if (s.length()==0){
            return true;
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                if (j == s.length())
                {
                    return true;
                }
            }
        }
        return false;
    }
}
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        String S = "abbacca";
        System.out.println(removeAllAdjacentDuplicatesInString.removeDuplicates(S));
    }

    public String removeDuplicates(String S) {
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            if(top>=0&&stack.charAt(top)==S.charAt(i)){
                stack.deleteCharAt(top);
                top--;
            }else{
                stack.append(S.charAt(i));
                top++;
            }
        }
        return stack.toString();
    }
}

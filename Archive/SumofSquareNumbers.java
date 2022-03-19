public class SumofSquareNumbers {
    public static void main(String[] args) {
        SumofSquareNumbers sumofSquareNumbers = new SumofSquareNumbers();
        int c = 789643561;
        System.out.println(sumofSquareNumbers.judgeSquareSum(c));
    }

    public boolean judgeSquareSum(int c) {
        int l = 0;
        int r = (int) Math.sqrt(c);
        while (r >= l) {
            if (l * l + r * r < c) {
                l++;
            } else if (l * l + r * r > c) {
                r--;
            } else {
                return true;
            }
        }
        return false;
    }
}

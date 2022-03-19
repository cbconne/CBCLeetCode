public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int X = 3;
        GrumpyBookstoreOwner grumpyBookstoreOwner = new GrumpyBookstoreOwner();
        System.out.println(grumpyBookstoreOwner.maxSatisfied(customers, grumpy, X));
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int sum = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }
        int l = 0;
        int r = X - 1;
        int maxChange = 0;
        int tempChange = 0;
        for (int i = l; i <= r; i++) {
            if (grumpy[i] == 1) {
                tempChange += customers[i];
            }
        }
        maxChange = tempChange;
        l++;
        r++;
        while (r < customers.length) {
            if (grumpy[r] == 1) {
                tempChange += customers[r];
            }
            if (grumpy[l - 1] == 1) {
                tempChange -= customers[l - 1];
            }
            maxChange = Math.max(maxChange, tempChange);
            l++;
            r++;
        }
        return sum + maxChange;
    }
}

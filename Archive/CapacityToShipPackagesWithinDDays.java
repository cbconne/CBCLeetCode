import java.util.Arrays;

public class CapacityToShipPackagesWithinDDays {

    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();
//        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int D = 5;
        int[] weights = {1, 2, 3, 1, 1};
        int D = 4;
        System.out.println(capacityToShipPackagesWithinDDays.shipWithinDays(weights, D));
    }

    public int shipWithinDays(int[] weights, int D) {
        int minW;
        if (Arrays.stream(weights).max().isPresent()) {
            minW = Arrays.stream(weights).max().getAsInt();
        } else {
            return 0;
        }
        int maxW = Arrays.stream(weights).sum();
        while (maxW > minW) {
            int midW = (minW + maxW) / 2;
            if (canShip(weights, D, midW)) {
                maxW = midW;
            } else {
                minW = midW + 1;
            }
        }
        return minW;
    }

    public boolean canShip(int[] weights, int D, int W) {
        int sumW = 0;
        int countD = 1;
        for (int weight : weights) {
            if (sumW + weight <= W) {
                sumW += weight;
            } else {
                countD++;
                sumW = weight;
            }
        }
        return countD <= D;
    }

}

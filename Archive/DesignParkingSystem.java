public class DesignParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }

}

class ParkingSystem {

    int[] parking;

    public ParkingSystem(int big, int medium, int small) {
        this.parking = new int[4];
        this.parking[1] = big;
        this.parking[2] = medium;
        this.parking[3] = small;
    }

    public boolean addCar(int carType) {
        if (parking[carType] > 0) {
            parking[carType]--;
            return true;
        } else {
            return false;
        }
    }
}
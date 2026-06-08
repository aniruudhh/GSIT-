package ConstructorChaining;

public class Mall {

    Mall() {
        System.out.println("Welcome to the mall");
    }

    Mall(int totalShops, int totalFloors, String cinema) {

        this();

        System.out.println("Total Shops: " + totalShops);
        System.out.println("Total Floors: " + totalFloors);
        System.out.println("Cinema: " + cinema);
    }

    public static void main(String[] args) {

        Mall m = new Mall(100, 5, "PVR");
    }
}
public class MaxFinder {

    
    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public double findMax(double a, double b) {
        return (a > b) ? a : b;
    }

    
    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();

        int maxInt = maxFinder.findMax(10, 25);
        double maxDouble = maxFinder.findMax(12.7, 9.4);

        System.out.println("Max (int): " + maxInt);
        System.out.println("Max (double): " + maxDouble);
    }
}


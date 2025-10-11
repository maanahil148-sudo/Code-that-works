public class AreaCalculator {

    
    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    
    public static void main(String[] args) {
        AreaCalculator areaCalc = new AreaCalculator();

        int squareArea = areaCalc.calculateArea(5);          
        int rectangleArea = areaCalc.calculateArea(6, 4);    
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}


//Adrian Garcia
package j2023_09_12.src.c;

public class TestMe {
    private double value = Double.NaN;

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public TestMe() {
    }

    public double square() {
        return value * value;
    }

    public double subtract() {
        return value - value;
    }

    public double add() {
        return value + value;
    }

    public double divide() {
        return value / value;
    }

    public void setValue(double v) {
        value = v;
    }

}
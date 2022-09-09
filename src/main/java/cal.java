

public class cal {

    private double res;

    public double getResult() {
        return res;
    }

    public void add(double x, double y) {
        res = (x + y);
        System.out.println(x + " + " + y + " is: " + res);
    }

    public void subtract(double x, double y) {
        res = (x - y);
        System.out.println(x + " - " + y + " is: " + res);
    }

    public void multiply(double x, double y) {
        res = (x * y);
        System.out.println(x + " * " + y + " is: " + res);
    }

    public void divide(double x, double y) {
        res = (x / y);
        System.out.println(x + " / " + y + " is: " + res);
    }

    public void exponent(double x, double y) {
        res = Math.pow(x, y);
        System.out.println(x + " ^ " + y + " is: " + res);
    }

    public static void main(String[] args) {
        cal c = new cal();
        c.add(1.52, 235.1);
    }

}
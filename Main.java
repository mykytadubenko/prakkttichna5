public class Main {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.9;
        double c = 0.61;

        double x = (Math.pow(a, 2 * c) + Math.pow(b, -c) * Math.cos(a + b)) / (c + 1);

        double y = Math.sqrt(Math.pow(c, 2) + b) - Math.pow(b, 3) * Math.pow(Math.sin((c + a) / c), 3);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

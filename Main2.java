import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введіть значення a: ");
        double a = scanner.nextDouble();
        System.out.print("введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("введіть значення x: ");
        double x = scanner.nextDouble();

        double result;

        if (x > -3 && x < 2) {
            result = Math.sqrt(a * x + 2);
        } else if (x == 2) {
            result = Math.cos(2 * x);
        } else if (x > 2) {
            result = 3 * Math.pow(x, 2) + b * x + 1;
        } else {
            System.out.println("x виходить за межі визначеного діапазону");
            return;
        }

        System.out.println("f(x) = " + result);
    }
}

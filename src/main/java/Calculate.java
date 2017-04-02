import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

class Calculate {
    int a, l, b;
    private static double h, r;
    private Scanner scanner;
    static Calculate output = new Calculate();

    Calculate() {
        scanner = new Scanner(System.in);
    }

    int get_int_val() throws IOException {
        return scanner.nextInt();
    }

    double get_double_val() throws IOException {
        return scanner.nextDouble();
    }

    static Calculate do_calc() {
        return output;
    }

    void display(double volume) {
        BigDecimal bd = new BigDecimal(volume);
        bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
        System.out.println(bd);
    }

    double get_volume(int a) throws NumberFormatException {
        if (a <= 0) {
            throw new NumberFormatException("All the values must be positive");
        } else {
            return a * a * a;
        }
    }

    double get_volume(double r) throws NumberFormatException {
        if (r <= 0) {
            throw new NumberFormatException("All the values must be positive");
        } else {
            return r * r * r * Math.PI * 2/3;
        }
    }

    double get_volume(double r, double h) throws NumberFormatException {
        if (r <= 0 || h <= 0) {
            throw new NumberFormatException("All the values must be positive");
        } else {
            return Math.PI * Math.pow(r, 2) * h;
        }
    }

    double get_volume(int l, int b, int h) throws NumberFormatException {
        if (l <= 0 || b <= 0 || h <= 0) {
            throw new NumberFormatException("All the values must be positive");
        } else {
            return l * b * h;
        }
    }
}

package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        TriangleExercise16 x = new TriangleExercise16();
        TriangleExercise16 y = new TriangleExercise16();

        System.out.println("Enter the measures of traingle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Enter the measures of traingle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        System.out.println(x.area());
        System.out.println(y.area());

        scan.close();
    }
}

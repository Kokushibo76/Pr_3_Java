import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        try {
            System.out.println("Введите данные");

            System.out.print("Введите сторону a: ");
            double a = console.nextDouble();

            System.out.print("Введите сторону b: ");
            double b = console.nextDouble();

            System.out.print("Введите сторону c: ");
            double c = console.nextDouble();

            if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                System.out.println("a, b и c являются сторонами прямоугольного треугольника");
            }
            else if (a == b && b == c) {
                System.out.println("a, b и c являются сторонами равностороннего треугольника");
            }
            else if (a == b || b == c || c == a) {
                    System.out.println("a, b и c являются сторонами равнобедренного треугольника");
            }
            else if (a + b <= c || b + c <= a || c + a <= b) {
                System.out.println("a, b и c не являются сторонами треугольника");
            }
            else {
                System.out.println("a, b и c являются сторонами обычного треугольника");
            }

            System.out.print("Процесс окончен.");
        }
        catch(Exception e){}
    }
}
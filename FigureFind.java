import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class FigureFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру для расчета площади и периметра (1 - квадрат, 2 - треугольник):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите длину стороны квадрата:");
            double sideLength = scanner.nextDouble();
            Square square = new Square(sideLength);
            System.out.println("Площадь квадрата: " + square.calculateArea());
            System.out.println("Периметр квадрата: " + square.calculatePerimeter());
        } else if (choice == 2) {
            System.out.println("Введите длины сторон треугольника:");
            double sideA = scanner.nextDouble();
            double sideB = scanner.nextDouble();
            double sideC = scanner.nextDouble();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            System.out.println("Площадь треугольника: " + triangle.calculateArea());
            System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        } else {
            System.out.println("Некорректный выбор.");
        }
    }
}
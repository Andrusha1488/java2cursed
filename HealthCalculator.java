import java.util.Scanner;

public class HealthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш текущий вес в кг:");
        double weight = scanner.nextDouble();

        System.out.println("Введите ваш рост в метрах:");
        double height = scanner.nextDouble();

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        double imt = weight / (height * height);
        double idealWeight = 24.9 * height * height;
        double dailyCalories;

        if (imt > 24.9) {
            double weightToLose = weight - idealWeight;
            dailyCalories = calculateDailyCalories(weight, height, age, -500);
            System.out.println("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: " + idealWeight + " кг. Необходимо сбросить: " + weightToLose + " кг. Рекомендуемый дневной прием калорий: " + dailyCalories);
        } else if (imt < 18.5) {
            double weightToGain = idealWeight - weight;
            dailyCalories = calculateDailyCalories(weight, height, age, 500);
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: " + idealWeight + " кг. Необходимо набрать: " + weightToGain + " кг. Рекомендуемый дневной прием калорий: " + dailyCalories);
        } else {
            dailyCalories = calculateDailyCalories(weight, height, age, 0);
            System.out.println("Ваш вес находится в пределах нормы. Идеальный вес: " + idealWeight + " кг. Рекомендуемый дневной прием калорий: " + dailyCalories);
        }
    }

    public static double calculateDailyCalories(double weight, double height, int age, int caloriesAdjustment) {
        double imt = 88.362 + (13.397 * weight) + (4.799 * height * 100) - (5.677 * age);
        return imt + caloriesAdjustment;
    }
}
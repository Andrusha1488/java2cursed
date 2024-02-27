import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        boolean trigger = true;
        while (trigger) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            input = input.replaceAll("\\s", "").toLowerCase();

            int length = input.length();
            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Строка является палиндромом.");
            } else {
                System.out.println("Строка не является палиндромом.");
                trigger = false;
            }
        }
    }
}
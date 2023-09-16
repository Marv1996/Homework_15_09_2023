import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        boolean isActive = true;
        while (isActive) {
            System.out.println("Please input your password: ");
            String password = scanner.next();
            System.out.println(main.isStrong(password));
            if (main.isStrong(password)) {
                System.out.println("Your welcome");
                isActive = false;
            }
        }
    }

    public boolean isStrong(String password) {

        char[] charUppercase = password.toCharArray();
        int uppercaseCount = 0;
        int digitCount = 0;

        // is length >= 8
        if (password.length() < 8) {
            return false;
        }

        // has min 2 uppercase / has min 3 digits
        for (char passwordChar : charUppercase) {
            if (Character.isUpperCase(passwordChar)) {
                uppercaseCount++;
            } else if (Character.isDigit(passwordChar)) {
                digitCount++;
            }
        }

        return uppercaseCount > 1 && digitCount > 2;
    }
}
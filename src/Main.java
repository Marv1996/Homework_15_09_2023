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
        boolean length = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;

        char[] charUppercase = password.toCharArray();
        int uppercaseCount = 0;
        int digitCount = 0;

        // is length >= 8
        if (password.length() >= 8) {
            length = true;
        }

        // has min 2 uppercase
        for (char passwordChar : charUppercase) {
            if (Character.isUpperCase(passwordChar)) {
                uppercaseCount++;
            }
        }
        if (uppercaseCount >= 2) {
            hasUppercase = true;
        }

        // has min 3 digits
        for (char passwordChar : charUppercase) {
            if (Character.isDigit(passwordChar)) {
                digitCount++;
            }
        }
        if (digitCount >= 3) {
            hasDigit = true;
        }

        return length && hasUppercase && hasDigit;
    }
}
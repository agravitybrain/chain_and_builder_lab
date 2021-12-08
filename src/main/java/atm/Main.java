package atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        amount
        final Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        ATM atm = new ATM(amount);
    }
}

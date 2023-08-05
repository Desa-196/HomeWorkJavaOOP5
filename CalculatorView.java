// Представление (View)

import java.util.Scanner;

public class CalculatorView {
    private Scanner input;

    public CalculatorView() {
        input = new Scanner(System.in);
    }
    public void displayResult(float result) {
        System.out.println("Результат: " + result);
    }
    public float readFloatFromConsole() {
        System.out.print("Введите число: ");
        while (!input.hasNextFloat()) {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.nextLine();
        }
        float number = input.nextFloat();
        input.nextLine();
        return number;
    }
    public String getOperation() {
        System.out.print("Введите операцию (*,/,+.-): ");
        String operator = input.nextLine();
        while( !(operator.equals("+") || operator.equals("-") || operator.equals("*") ||operator.equals("/")) )
        {
            System.out.print("Ошибка ввода, повторите: ");
            operator = input.nextLine();
        }
        return operator;
    }
}
// Представление (View)

import java.util.Scanner;

public class CalculatorView {
    private Scanner input;
    public CalculatorView(){
        input = new Scanner(System.in);
    }
    public void displayResult(float result) {
        System.out.println("Результат: " + result);
    }

    public float readDoubleFromConsole() {
        System.out.print("Введите число: ");    
        while (!input.hasNextFloat()) {
            System.out.print("Ошибка ввода, повторите ввод: ");
            input.next();
        }
        float result = input.nextFloat();
        return result;

    }
}
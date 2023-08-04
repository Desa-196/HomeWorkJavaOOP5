public class CalculatorModel {
    private float result;

    public void add(float number1, float number2) {
        result = number1 + number2;
    }
    public void subtract(float number1, float number2) {
        result = number1 - number2;
    }
    public void divide(float number1, float number2) {
        if(number2 != 0){
        result = number1 / number2;
        }
        else{
            throw new IllegalArgumentException("Невозможно разделить на ноль!");
        }
    }
    public void multiply(float number1, float number2) {
        result = number1 * number2;
    }
    public float getResult() {
        return result;
    }
}

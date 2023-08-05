public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {

        //В данном случае Presenter пинает View запросить у пользователя ввести два числа
        float number1 = view.readFloatFromConsole();
        float number2 = view.readFloatFromConsole();
        
        //Затем Presenter просит View спросить у пользователя: "А что с ними делать то?", и в зависимости от ответа говорит модели какую логику нужно провернуть с числами
        switch (view.getOperation()) {
            case "*":
                model.multiply(number1, number2);
                break;
            case "/":
                model.divide(number1, number2);
                break;
            case "+":
                model.add(number1, number2);
                break;
            case "-":
                model.subtract(number1, number2);
                break;

        }
        //Ну и просит View отобразить содержимое результата в модели
        view.displayResult(model.getResult());
    }
}

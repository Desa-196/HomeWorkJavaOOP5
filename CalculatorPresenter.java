public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        float number1 = view.readDoubleFromConsole();
        float number2 = view.readDoubleFromConsole();

        model.add(number1, number2);
        float result = model.getResult();

        view.displayResult(result);
    }
}

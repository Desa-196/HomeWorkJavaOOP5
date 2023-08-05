public class Main {
    public static void main(String[] args) {
        // Создание экземпляров модели, представления и презентера
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        presenter.calculate();
    }
}
public class Program {
    public static void main(String[] args) {
        String[] data = {"source", "data", "foo", "bar"};
        {
            IEditStringOutputPort outputPort = new ConsolePresenter();
            IEditStringUseCase interactor = new ToCsvUseCase(outputPort);
            Controller controller = new Controller(interactor);
            controller.Execute(data);
        }
        {
            IEditStringOutputPort outputPort = new SaveToFilePresenter();
            IEditStringUseCase interactor = new ToCsvUseCase(outputPort);
            Controller controller = new Controller(interactor);
            controller.Execute(data);
        }
        {
            IEditStringOutputPort outputPort = new ConsolePresenter();
            IEditStringUseCase interactor = new ToTsvUseCase(outputPort);
            Controller controller = new Controller(interactor);
            controller.Execute(data);
        }
        {
            IEditStringOutputPort outputPort = new SaveToFilePresenter();
            IEditStringUseCase interactor = new ToTsvUseCase(outputPort);
            Controller controller = new Controller(interactor);
            controller.Execute(data);
        }
    }
}

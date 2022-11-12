public class Controller {
    private final IEditStringUseCase inputPort;

    public Controller(IEditStringUseCase inputPort) {
        this.inputPort = inputPort;
    }

    public void Execute(String[] source) {
        inputPort.handle(source);
    }
}
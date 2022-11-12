public class ToTsvUseCase implements IEditStringUseCase {
    private final IEditStringOutputPort outputPort;

    public ToTsvUseCase(IEditStringOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    public void handle(String[] data) {
        String result = String.join("\t", data);
        outputPort.emit(result);
    }
}

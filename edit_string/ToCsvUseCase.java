public class ToCsvUseCase implements IEditStringUseCase {
    private final IEditStringOutputPort outputPort;

    public ToCsvUseCase(IEditStringOutputPort outputPort) {
        this.outputPort = outputPort;
    }

    public void handle(String[] data) {
        String result = String.join(",", data);
        outputPort.emit(result);
    }
}


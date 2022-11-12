public class ConsolePresenter implements IEditStringOutputPort {
    public void emit(String data) {
        System.out.println(data);
    }
}

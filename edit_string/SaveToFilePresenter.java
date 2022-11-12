import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFilePresenter implements IEditStringOutputPort{
    private final File file = new File("out.txt");

    public void emit(String data) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        try {
            FileWriter filewriter = new FileWriter(file);
            filewriter.write(data);
            filewriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

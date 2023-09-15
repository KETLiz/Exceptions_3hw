import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {

    public void writeToFile(Human human, String fileName) {
        try(ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(fileName))) {
            write.writeObject(human);
        } catch(IOException e) {
            System.out.println("Проблема с записью в файл");
        }
    }
}

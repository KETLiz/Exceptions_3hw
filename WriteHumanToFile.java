import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteHumanToFile {

    public void writeHumanToFile(Human human, String fileName) {
        try(ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(fileName))) {
            write.writeObject(human);
        } catch(IOException e) {
            System.out.println("Проблема с записью в файл");
        }
    }

    public void writeToFile(String fileName, String info) {
        File f = new File(fileName);
        if(!f.exists()) {
            try(FileWriter file = new FileWriter(fileName)) {
                file.write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(FileWriter file = new FileWriter(fileName, true)) {
            file.write(info + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

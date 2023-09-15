import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
    
    public Human loadHuman(String fileName) {
        Human restored = null;
        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName))) {
            restored = (Human) read.readObject();
            
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return restored;
    }

    public void readFromFile(String fileName) {
        try(FileReader file = new FileReader(fileName)) {
            int count = 0;
            while((count = file.read()) != -1) {
                System.out.print((char) count);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {
    
    public Human load(String fileName) {
        Human restored = null;
        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName))) {
            restored = (Human) read.readObject();
            
        } catch(IOException e) {
            System.out.println("Проблема с чтением файла");
        } catch(ClassNotFoundException e) {
            System.out.println("Объект не найден");
        }
        return restored;
    }
}

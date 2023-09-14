import java.util.Scanner;

import Exceptions.AlphabetCountException;
import Exceptions.GenderException;
import Exceptions.TelephonCountException;
import Exceptions.WordCountException;

public class Menu2 {
    Scanner in;

    public Menu2() {
        in = new Scanner(System.in);
    }

    public void getInformation() throws WordCountException, TelephonCountException, AlphabetCountException, GenderException {
        System.out.println("Введите следующие данные, разделённые пробелом: " +
        "фамилия имя отчество датаРождения номерТелефона пол");
        String data = in.nextLine();
        String[] info = data.split(" ");
    }

    
}

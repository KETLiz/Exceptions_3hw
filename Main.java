import java.util.Scanner;

import Exceptions.AlphabetCountException;
import Exceptions.DateException;
import Exceptions.GenderException;
import Exceptions.TelephonCountException;

public class Main {
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        try {
            menu.parsingInfo();
            
        } catch (AlphabetCountException | TelephonCountException | DateException | GenderException e) {
            System.out.println(e.getMessage());
        }
    }
}
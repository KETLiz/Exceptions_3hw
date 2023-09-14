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
    
        //Checks c = new Checks();
       // System.out.println(c.isDate("10.01.2022"));


        // try {
        //     Menu2 m = new Menu2();
        //     m.getInformation();
        // } catch (WordCountException e) {
        //     System.out.println(e.getMessage());
        // } catch (TelephonCountException e) {
        //     System.out.println(e.getMessage());
        // } catch (AlphabetCountException e) {
        //     System.out.println(e.getMessage());
        // } catch (GenderCountException e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
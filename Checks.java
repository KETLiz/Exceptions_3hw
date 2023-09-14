import Exceptions.AlphabetCountException;
import Exceptions.GenderException;
import Exceptions.TelephonCountException;

public class Checks{

    public int wordCountCheck(String[] arr) {
        if(arr.length < 6) {
            return -1;
        }
        if(arr.length > 6) {
            return -2;
        }
        return arr.length;
    }

    public boolean isNumeric(String arg) {
        return arg.matches("[0-9]+");
    }

    public boolean isAtphabet(String arg) {
        if(arg.length() > 1) {
            return arg.matches("[a-zA-z]+");
        }
        return false;
    }
    public boolean isDate(String arg) {
        return arg.matches("[0-9]{2}.[0-9]{2}.[0-9]{4}");
    }

    public boolean isFMChar(String arg) {
        return arg.matches("[fm]");    
    }

    public void dataTypeCheck(String[] arr) throws TelephonCountException, AlphabetCountException, GenderException {
        int numCount = 0;
        int letterCount = 0;
        int charFMCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(isNumeric(arr[i])) {
                int telNumber = Integer.parseInt(arr[i]);
                if(numCount == 0) {
                    numCount = telNumber;
                } else if(numCount != 0) {
                    throw new TelephonCountException("Вы уЖе ввели номер телефона");
                }
            }
            if(isAtphabet(arr[i])) {
                if(letterCount == 0 || letterCount == 1 || letterCount == 2 || letterCount == 3) {
                    letterCount++;
                } else if(letterCount > 3) {
                    throw new AlphabetCountException("Вы уЖе ввели ФИО и дату роЖдения");
                }
            }
            if(isFMChar(arr[i])) {
                if(charFMCount == 0) {
                    charFMCount++;
                } else {
                    throw new GenderException("Вы уЖе ввели свой пол");
                }
            }
        }
    }
}
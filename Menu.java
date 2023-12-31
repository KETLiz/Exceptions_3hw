import java.util.Scanner;

import Exceptions.AlphabetCountException;
import Exceptions.DateException;
import Exceptions.GenderException;
import Exceptions.TelephonCountException;
import Exceptions.WordCountException;

public class Menu {
    Scanner in;
    Checks check;

    public Menu() {
        in = new Scanner(System.in);
        check = new Checks();
    }

    public void parsingInfo() throws AlphabetCountException, TelephonCountException, DateException, GenderException {
        String[] arr = getInfo();
        String surName  = null;
        String name = null;
        String patronymic = null;
        String birthDay = null;
        String telNumber = null;
        String gender = null;

        for(int i = 0; i <= 2; i++) {
            if(check.isAtphabet(arr[i])) {
                surName = arr[0];
                name = arr[1];
                patronymic = arr[2];
            } else {
                throw new AlphabetCountException("Вы ввели невалидные значения");
            }
        }

        if(check.isDate(arr[3])) {
            birthDay = arr[3];
        } else {
            throw new DateException("Формат ввода даты роЖдения dd.mm.yyyy");
        }
        
        try{
            telNumber = arr[4];
        } catch(NumberFormatException e) {
            System.out.println("Неправильно набран номер");
        }

        if(check.isFMChar(arr[5])) {
            gender = arr[5];
        } else {
            throw new GenderException("Введите f или m");
        }
        String fileName = surName;
        String res = surName + " " + name + " " + patronymic + " " + birthDay + " " + telNumber + " " + gender;
        WriteHumanToFile w = new WriteHumanToFile();
        w.writeToFile(fileName, res);
        ReadFromFile read = new ReadFromFile();
        read.readFromFile(fileName);
        // Human human = new Human(name, surName, patronymic, birthDay, telNumber, gender);
        // String fileName = surName;

        // WriteHumanToFile w = new WriteHumanToFile();
        // w.writeHumanToFile(human, fileName);

        // ReadFromFile r = new ReadFromFile();
        // Human restoredHuman = r.loadHuman(fileName);
        // System.out.println(restoredHuman);
    }

    private String[] getInfo() {
        System.out.println("Введите следующие данные, разделённые пробелом: " +
        "фамилия имя отчество датаРождения номерТелефона пол");
        String info = in.nextLine();
        String[] infoArr = info.split(" ");

        try {
            checkWordCountWithException(infoArr);
        } catch (WordCountException e) {
            System.out.println(e.getMessage());
        }
        return infoArr;
    }

    private void checkWordCountWithException(String[] arr) throws WordCountException{
        int wordCount = check.wordCountCheck(arr);
        if(wordCount == -1) {
            throw new WordCountException("Вы ввели меньше данных, чем требуется");
        }
        if(wordCount == -2) {
            throw new WordCountException("Вы ввели больше данных, чем требуется");
        }
    }
}

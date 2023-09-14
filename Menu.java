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
        for(int i = 0; i <= 2; i++) {
            if(check.isAtphabet(arr[i])) {
                String surName = arr[0];
                String name = arr[1];
                String patronymic = arr[2];
            } else {
                throw new AlphabetCountException("Вы ввели невалидные значения");
            }
        }

        if(check.isDate(arr[3])) {
            String birthDay = arr[3];
        } else {
            throw new DateException("Формат ввода даты роЖдения dd.mm.yyyy");
        }
        
        try{
            String telNumber = arr[4];
            int telephonNumber = Integer.parseInt(telNumber);
        } catch(NumberFormatException e) {
            System.out.println("Неправильно набран номер");
        }

        if(check.isFMChar(arr[5])) {
            char gender = arr[5].charAt(0);
        } else {
            throw new GenderException("Введите f или m");
        }
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
        // try {
        //     checkWordCountWithException(infoArr);
        //     check.dataTypeCheck(infoArr);
        // } catch (WordCountException | TelephonCountException | AlphabetCountException | GenderCountException e) {
        //     System.out.println(e.getMessage());
        // }
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

import java.util.Scanner;

public class Menu2 {
    Scanner in;

    public Menu2() {
        in = new Scanner(System.in);
    }

    public void getInformation() {
        System.out.println("Введите следующие данные, разделённые пробелом: " +
        "фамилия имя отчество датаРождения номерТелефона пол");
        String data = in.nextLine();
        String[] info = data.split(" ");

        int wordCheck = wordCountCheck(info);
        switch(wordCheck) {
            case -1:
                System.out.printf("Вы ввели на %d меньше слов, чем требуется!", 6-info.length);
                break;
            case -2:
                System.out.printf("Вы ввели на %d слов больше, чем требуется!", info.length-6);
                break;
            case 6:
                System.out.println("Количество слов введено верно");
                break;   
        }
        dataTypeCheck(info);
        
    }

    private int wordCountCheck(String[] arr) {
        if(arr.length < 6) {
            return -1;
        }
        if(arr.length > 6) {
            return -2;
        }
        return arr.length;
    }

    public void dataTypeCheck(String[] arr) {
        int numCount = 0;
        int letterCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(isNumeric(arr[i])) {
                int telNumber = Integer.parseInt(arr[i]);
                if(numCount == 0) {
                    System.out.println("метод отработал");
                    numCount = telNumber;
                } else if(numCount != 0) {
                    System.out.println("Вы уже ввели один номер телефона");
                }
            }
            if(isAtphabet(arr[i])) {
                if(letterCount == 0 || letterCount == 1 || letterCount == 2) {
                    System.out.println("Я нашёл строку " + arr[i]);
                    letterCount++;
                } else if(letterCount > 2) {
                    System.out.println("слишком много строк");
                }
            }
            if(isFMChar(arr[i])) {
                System.out.println("Женщина или му;чина?");
            }
        }
    }

    private boolean isNumeric(String arg) {
        return arg.matches("[0-9]+");
    }

    private boolean isAtphabet(String arg) {
        if(arg.length() > 2) {
            return arg.matches("[а-яА-Я]+") || arg.matches("[a-zA-z]");
        }
        return false;
    }

    private boolean isFMChar(String arg) {
        return arg.matches("[f|m]");
    }
}
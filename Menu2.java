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
        int r = res(data);
        System.out.println(r);
    }

    public int res(String data) {
        String[] info = data.split(" ");
        if(info.length < 6) {
            System.out.printf("Вы ввели на %d меньше слов, чем требуется!", 6-info.length);
            return -1;
        }
        if(info.length > 6) {
            System.out.printf("Вы ввели на %d слов больше, чем требуется!", info.length-6);
            return -2;
        }
        return info.length;
    }
}
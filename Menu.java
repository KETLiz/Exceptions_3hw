import java.util.Scanner;

public class Menu {
    Scanner in;

    public Menu() {
        in = new Scanner(System.in);
    }

    public void questioning() {
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите фамилию: ");
        String surName = in.nextLine();
        System.out.print("Введите отчество: ");
        String patronymic = in.nextLine();
        System.out.print("Введите год рождения: ");
        String birthDate = in.nextLine();
        System.out.println("Введите номер телефона: ");
        String t = in.nextLine();
        int telNumber = Integer.parseInt(t);
        System.out.println("Введите ваш пол f или m: ");
        String g = in.nextLine();
        Gender gender = Gender.valueOf(g);

        Human human = new Human(name, surName, patronymic, birthDate, telNumber, gender);
        System.out.println(human);
    }
}

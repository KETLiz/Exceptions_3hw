import java.io.Serializable;

public class Human implements Serializable {
    private String name;
    private String surName;
    private String patronymic;
    private String birthDate;
    private String telNumber;
    private String gender;

    public Human(String name, String surName, String patronymic, String birthDate, String telNumber, String gender) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.telNumber = telNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return getSurName() + " " + getName() + " " + getPatronymic() + " " + getBirthDate() + " "
            + getTelNumber() + " " + getGender();
    }
}

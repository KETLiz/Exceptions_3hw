public class Human {
    private String name;
    private String surName;
    private String patronymic;
    private String birthDate;
    private int telNumber;
    private Gender gender;

    public Human(String name, String surName, String patronymic, String birthDate, int telNumber, Gender gender) {
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

    public int getTelNumber() {
        return telNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return getSurName() + " " + getName() + " " + getPatronymic() + " " + getBirthDate() + " "
            + getTelNumber() + " " + getGender();
    }
}

package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String category;

    public Doctor(String name, String surname, String education, int birthday, String category) {
        super(name, surname, education, birthday);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

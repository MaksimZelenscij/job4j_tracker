package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String level;

    public Engineer(String name, String surname, String education, int birthday, String level) {
        super(name, surname, education, birthday);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

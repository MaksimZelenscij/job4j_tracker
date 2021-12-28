package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String testing;

    public Builder(String name, String surname, String education, int birthday, String level, String testing) {
        super(name, surname, education, birthday, level);
        this.testing = testing;
    }

    public String getTesting() {
        return testing;
    }

    public void seTesting(String testing) {
        this.testing = testing;
    }
}

package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean plastic;

    public Surgeon(String name, String surname, String education, int birthday, String category, boolean plastic) {
        super(name, surname, education, birthday, category);
        this.plastic = plastic;
    }

    public boolean isPlastic() {
        return plastic;
    }

    public void setPlastic(boolean plastic) {
        this.plastic = plastic;
    }
}

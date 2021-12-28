package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean prosthetist;

    public Dentist(String name, String surname, String education, int birthday, String category, boolean prosthetist) {
        super(name, surname, education, birthday, category);
        this.prosthetist = prosthetist;
    }

    public boolean isProsthetist() {
        return prosthetist;
    }

    public void setProsthetist(boolean prosthetist) {
        this.prosthetist = prosthetist;
    }
}

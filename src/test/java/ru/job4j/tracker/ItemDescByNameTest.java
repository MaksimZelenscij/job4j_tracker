package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compareDesc() {
        Item remont = new Item(2, "Remont");
        Item dostavka = new Item(4, "Dostavka");
        Item vozvrat = new Item(3, "Vozvrat");
        List<Item> items = Arrays.asList(remont, dostavka, vozvrat);

        Collections.sort(items, new ItemDescByName());

        List<Item> expected = Arrays.asList(vozvrat, remont, dostavka);
        assertEquals(items, expected);
    }
}
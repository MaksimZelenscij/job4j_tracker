package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemAscByNameTest {

    @Test
    public void compareAsc() {
        Item remont = new Item(2, "Remont");
        Item dostavka = new Item(4, "Dostavka");
        Item vozvrat = new Item(3, "Vozvrat");
        List<Item> items = Arrays.asList(remont, dostavka, vozvrat);

        Collections.sort(items, new ItemAscByName());

        List<Item> expected = Arrays.asList(dostavka, remont, vozvrat);
        assertEquals(items, expected);
    }
}
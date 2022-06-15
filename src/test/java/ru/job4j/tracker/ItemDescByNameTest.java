package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compareDesc() {
        Item repair = new Item(2, "Repair");
        Item delivery = new Item(4, "Delivery");
        Item complaint = new Item(3, "Complaint");
        List<Item> items = Arrays.asList(repair, delivery, complaint);

        Collections.sort(items, new ItemDescByName());

        List<Item> expected = Arrays.asList(repair, delivery, complaint);
        assertEquals(items, expected);
    }
}
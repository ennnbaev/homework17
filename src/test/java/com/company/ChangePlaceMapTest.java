package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ChangePlaceMapTest {
    @Test
    public void checkChangeShouldChangesKeyValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivan", 20);
        map.put("Dima", 25);
        map.put("Ann", 30);
        Map<Integer, String> result = new HashMap<>();
        result.put(20, "Ivan");
        result.put(25, "Dima");
        result.put(30, "Ann");
        Assertions.assertEquals(result, ChangePlaceMap.changeKey(map));
    }

    @Test
    public void checkChangeShouldNothing() {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> result = new HashMap<>();
        Assertions.assertEquals(result, ChangePlaceMap.changeKey(map));
    }

}

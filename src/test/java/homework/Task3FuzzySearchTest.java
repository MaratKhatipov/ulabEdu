package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3FuzzySearchTest {

    @Test
    void whenCarThenTrue() {
        String target = "car";
        String original = "ca6$$#_rtwheel";
        Assertions.assertTrue(Task3FuzzySearch.fuzzySearch(target, original));
    }

    @Test
    void whenAllCharactersSameThenTrue() {
        String target = "cartwheel";
        String original = "cartwheel";
        Assertions.assertTrue(Task3FuzzySearch.fuzzySearch(target, original));
    }

    @Test
    void whenOrderCharactersIsDifferentThenFalse() {
        String target = "lw";
        String original = "cartwheel";
        Assertions.assertFalse(Task3FuzzySearch.fuzzySearch(target, original));
    }

    @Test
    void whenTargetIsNullThenFalse() {
        String target = null;
        String original = "eqweqwe";
        Assertions.assertFalse(Task3FuzzySearch.fuzzySearch(target, original));
    }

    @Test
    void whenOriginalIsNullThenFalse() {
        String target = "eqweqwe";
        String original = null;
        Assertions.assertFalse(Task3FuzzySearch.fuzzySearch(target, original));
    }

    @Test
    void whenTargetLengthIs0ThenFalse() {
        String target = "";
        String original = "cartwheel";
        Assertions.assertFalse(Task3FuzzySearch.fuzzySearch(target, original));
    }

    @Test
    void whenOriginalLengthIs0ThenFalse() {
        String target = "cartwheel";
        String original = "";
        Assertions.assertFalse(Task3FuzzySearch.fuzzySearch(target, original));
    }
}
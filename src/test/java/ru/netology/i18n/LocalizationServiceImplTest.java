package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {

    @Test
    void testRussia() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String expected = "Добро пожаловать";
        String actual = localizationService.locale(Country.RUSSIA);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testBrazil() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String expected = "Welcome";
        String actual = localizationService.locale(Country.BRAZIL);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGermany() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String expected = "Welcome";
        String actual = localizationService.locale(Country.GERMANY);

        Assertions.assertEquals(expected, actual);
    }

}
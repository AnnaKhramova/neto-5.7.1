package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void testRussia() {
        GeoService geoService = new GeoServiceImpl();
        String ip = "172.123.12.19";

        Country expected = Country.RUSSIA;
        Country actual = geoService.byIp(ip).getCountry();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testUsa() {
        GeoService geoService = new GeoServiceImpl();
        String ip = "96.123.12.19";

        Country expected = Country.USA;
        Country actual = geoService.byIp(ip).getCountry();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testLocalhost() {
        GeoService geoService = new GeoServiceImpl();
        String ip = "127.0.0.1";

        Country actual = geoService.byIp(ip).getCountry();

        Assertions.assertNull(actual);
    }

    @Test
    void testMoscow() {
        GeoService geoService = new GeoServiceImpl();
        String ip = "172.0.32.11";

        String expected = "Moscow";
        String actual = geoService.byIp(ip).getCity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNewYork() {
        GeoService geoService = new GeoServiceImpl();
        String ip = "96.44.183.149";

        String expected = "New York";
        String actual = geoService.byIp(ip).getCity();

        Assertions.assertEquals(expected, actual);
    }

}
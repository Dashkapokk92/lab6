package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldcalculateSum() {
        StatsService service = new StatsService();
        int[] menegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(menegerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMean() {
        StatsService service = new StatsService();
        int[] menegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateMean(menegerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMax() {
        StatsService service = new StatsService();
        int[] menegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 1;

        int actual = service.findMaxSale(menegerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMin() {
        StatsService service = new StatsService();
        int[] menegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 1;

        int actual = service.findMinSale(menegerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMaxMean() {
        StatsService service = new StatsService();
        int[] menegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = service.findMaxMeanSale(menegerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateMinMean() {
        StatsService service = new StatsService();
        int[] menegerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMinMeanSale(menegerSales);

        assertEquals(expected, actual);

    }
}
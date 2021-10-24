package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private final int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private final StatsService service = new StatsService();


    @Test
    void shouldCalculateSum() {

        assertEquals(180, service.calculateSum(sales));
    }

    @Test
    void shouldAverageSum() {

        assertEquals(15, service.averageSum(sales));
    }

    @Test
    void shouldMaxSales() {

        assertEquals(8, service.maxSales(sales));
    }

    @Test
    void shouldMinSales() {

        assertEquals(9, service.minSales(sales));
    }

    @Test
    void shouldMonthsMaxSales() {

        assertEquals(5, service.monthsMaxSales(sales));
    }

    @Test
    void shouldMonthsMinSales() {

        assertEquals(5, service.monthsMinSales(sales));
    }
}
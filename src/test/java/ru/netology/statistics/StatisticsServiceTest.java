package ru.netology.statistics;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {


    @org.junit.jupiter.api.Test
    void shouldSalesAmountForAllYear() {
        StatisticsService sales = new StatisticsService();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = sales.calculateSale(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldAverageAmountForAllYear() {
        StatisticsService averageSales = new StatisticsService();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = averageSales.averageAmount(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMonthOfMaxSales() {
        StatisticsService max = new StatisticsService();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = max.monthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMonthOfMinimumSales() {
        StatisticsService minimum = new StatisticsService();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = minimum.monthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldQuantityMonthOfMaxSales() {
        StatisticsService maxMonth = new StatisticsService();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = maxMonth.quantityMonthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldQuantityMonthOfMinimumSales() {
        StatisticsService minMonth = new StatisticsService();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = minMonth.quantityMonthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }


}
package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calcSumAll() {
        StatsService service = new StatsService();
        long[] sales = {22, 14, 12, 13, 16, 10, 36, 5, 26, 19, 14, 36};
        long actual = service.sumAll(sales);
        long expected = 223;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calcSumMiddle() {
        StatsService service = new StatsService();
        long[] sales = {22, 14, 12, 13, 16, 10, 36, 5, 26, 19, 14, 36};
        long actual = service.sumMiddle(sales);
        long expected = 223 / 12;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calcMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {22, 14, 12, 13, 16, 10, 36, 5, 26, 19, 14, 36};
        long actual = service.maxMonthSales(sales);
        long expected = 12;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calcMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {22, 14, 12, 13, 16, 10, 36, 5, 26, 19, 14, 36};
        long actual = service.minMonthSales(sales);
        long expected = 8;
        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void calcAmountMonthLessMiddle() {
        StatsService service = new StatsService();
        long[] sales = {22, 14, 12, 13, 16, 10, 36, 5, 26, 19, 14, 36};
        long actual = service.amountLessMiddle(sales);
        long expected = 7;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calcAmountMonthOverMiddle() {
        StatsService service = new StatsService();
        long[] sales = {22, 14, 12, 13, 16, 10, 36, 5, 26, 19, 14, 36};
        long actual = service.amountOverMiddle(sales);
        long expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}

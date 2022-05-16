package ru.netology.stats;

public class StatsService {
    public long sumAll(long[] sales) {
        int sumAll = 0;
        for (long sale : sales) {
            sumAll += sale;


        }
        return sumAll;
    }

    public long sumMiddle(long[] sales) {
        long sumAll = sumAll(sales);
        long months = 12;
        long sumMiddle = sumAll / months;

        return sumMiddle;

    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long amountLessMiddle(long[] sales) {
        long sumMiddle = sumMiddle(sales);
        long amountMinMonth = 0;
        for (long sale : sales) {
            if (sumMiddle > sale) {
                amountMinMonth++;

            }


        }
        return amountMinMonth;
    }


    public long amountOverMiddle(long[] sales) {
        long sumMiddle = sumMiddle(sales);
        long amountMaxMonth = 0;
        for (long sale : sales) {
            if (sumMiddle < sale) {
                amountMaxMonth++;

            }


        }
        return amountMaxMonth;
    }
}









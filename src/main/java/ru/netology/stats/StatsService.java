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
        int sumAll = 0;
        int sumMiddle = 0;
        for (long sale : sales) {
            sumAll += sale;
            sumMiddle = sumAll / 12;
        }
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
        int sumAll = 0;
        int sumMiddle;
        int amountMinMonth = 0;
        for (long sale : sales) {
            sumAll += sale;
        }
        sumMiddle = sumAll / 12;
        for (long sale1 : sales) {
            if (sumMiddle > sale1) {
                amountMinMonth++;

            }


        }
        return amountMinMonth;
    }


    public long amountOverMiddle(long[] sales) {
        int sumAll = 0;
        int sumMiddle;
        int amountMaxMonth = 0;
        for (long sale : sales) {
            sumAll += sale;

        }
        sumMiddle = sumAll / 12;
        for (long sale1 : sales)
            if (sumMiddle < sale1) {
                amountMaxMonth++;


            }
        return amountMaxMonth;
    }
}









